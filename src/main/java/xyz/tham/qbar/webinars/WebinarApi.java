package xyz.tham.qbar.webinars;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;

/**
 * @author tham
 */
@Path("/webinars")
public class WebinarApi {
    @Inject
    WebinarManager webinarManager;

    @GET
    public Response all() {
        return Response
                .ok()
                .entity(webinarManager.all())
                .build();
    }

    @POST
    public Response create(Webinar webinar) {
        String slug = webinarManager.add(webinar);
        return Response.created(URI.create(slug)).build();
    }

    @DELETE
    @Path("{slug}")
    public Response delete(@PathParam("slug") String slug) {
        webinarManager.delete(slug);
        return Response.noContent().build();
    }
}
