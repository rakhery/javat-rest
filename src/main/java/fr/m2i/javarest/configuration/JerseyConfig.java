package fr.m2i.javarest.configuration;

import fr.m2i.javarest.api.HelloWorld;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            register(HelloWorld.class);

    }


}
