package fr.m2i.javarest.api.helloAPI;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String getHelloWorld()
    {
        return "Hello World from text/plain Spring and Jersey, my First API ";
    }

}
