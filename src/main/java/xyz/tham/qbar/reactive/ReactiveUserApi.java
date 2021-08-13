package xyz.tham.qbar.reactive;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.groups.MultiCreate;
import io.smallrye.mutiny.groups.UniCreate;
import org.jboss.logging.Logger;
import xyz.tham.qbar.config.Welcome;
import xyz.tham.qbar.models.User;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/reactive")
public class ReactiveUserApi {
    private static final Logger LOGGER = Logger.getLogger(ReactiveUserApi.class);

    @Inject
    Welcome welcome;

    @GET
    @Path("{name}")
    public Uni<User> getByName(@PathParam("name") String name) {
        LOGGER.infof("Message from config %s", welcome.getMessage());
        return Uni.createFrom().item(new User("Tham", 42));
    }

    @GET
    public Multi<User> all() {
        LOGGER.info("ReactiveUserApi.all()");
        return MultiCreate.INSTANCE
                .item(new User("Tham", 43));
    }
}
