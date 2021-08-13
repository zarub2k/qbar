package xyz.tham.qbar.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Welcome {
    @ConfigProperty(name = "welcome.message")
    String message;

    public String getMessage() {
        return message;
    }
}
