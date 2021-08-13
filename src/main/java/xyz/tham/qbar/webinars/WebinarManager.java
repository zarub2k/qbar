package xyz.tham.qbar.webinars;

import xyz.tham.qbar.misc.SlugGenerator;

import javax.enterprise.context.ApplicationScoped;
import java.util.*;

/**
 * @author tham
 */
@ApplicationScoped
public class WebinarManager {
    private Set<Webinar> webinars = Collections.newSetFromMap(
      Collections.synchronizedMap(new LinkedHashMap<>()));

    public Set<Webinar> all() {
        return webinars;
    }

    public String add(Webinar webinar) {
        String slug = SlugGenerator.get(webinar.title);
        webinar.slug = slug;
        webinars.add(webinar);

        return slug;
    }

    public void update(String slug, Webinar webinar) {
        delete(slug);
        add(webinar);
    }

    public void delete(String slug) {
        webinars.removeIf(webinar -> webinar.slug.equals(slug));
    }
}
