package xyz.tham.qbar.filters;

import io.vertx.core.http.HttpServerRequest;
import org.jboss.logging.Logger;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class LoggingFilter implements ContainerRequestFilter {
    public static final Logger LOGGER = Logger.getLogger(LoggingFilter.class);
    @Context
    HttpServerRequest request;

    @Override
    public void filter(ContainerRequestContext context)
            throws IOException {
        String method = context.getMethod();
        String path = context.getUriInfo().getPath();
        String address = request.remoteAddress().toString();
        LOGGER.infof("Request from %s %s from IP %s", method, path, address);
    }
}
