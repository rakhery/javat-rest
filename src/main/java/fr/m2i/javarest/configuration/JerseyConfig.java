package fr.m2i.javarest.configuration;

import fr.m2i.javarest.api.annuaireApi.AnnuaireApi;
import fr.m2i.javarest.api.bookAPI.BookContentResource;
import fr.m2i.javarest.api.bookAPI.BookResource;
import fr.m2i.javarest.api.bookAPI.BookResponseResource;
import fr.m2i.javarest.api.helloAPI.HelloWorld;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            register(HelloWorld.class);
            register(AnnuaireApi.class);
            register(BookContentResource.class);
            register(BookResource.class);
            register(BookResponseResource.class);



    }


}
