package xyz.tham.qbar.webinars;

/**
 * @author tham
 */
public class Webinar {
    public String slug;
    public String title;
    public String summary;

    public Webinar() {}
    public Webinar(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }
}
