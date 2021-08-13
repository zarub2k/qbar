package xyz.tham.qbar.filters;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class ResponseInjectionFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext reqContext,
                       ContainerResponseContext resContext) throws IOException {
        resContext.getHeaders().add("X-PoweredBy", "Tham.xyz");
    }
}
