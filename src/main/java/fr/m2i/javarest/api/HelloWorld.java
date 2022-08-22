package fr.m2i.javarest.api;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

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
