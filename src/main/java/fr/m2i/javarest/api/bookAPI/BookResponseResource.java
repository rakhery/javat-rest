package fr.m2i.javarest.api.bookAPI;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/responsebooks")
public class BookResponseResource {

    @GET
    @Path("ok/without_response")
    public String getBookWithoutResponse() {
        return "Java For Life";
    }

    @GET
    @Path("ok")
    public Response getBook() {
        return Response.status(Response.Status.OK).entity("Java For Life").build();
    }

    @GET
    @Path("ok/headers")
    public Response getBookWithHeaders() {
        return Response.status(Response.Status.OK).entity("Java For Life").header("param1", "value1").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("ok/json_annotation")
    public Book getBookJSONAnnotation() {
        Book current = new Book();
        current.setIsbn("1-111111-11");
        current.setName("Harry");
        return current;
    }

    @GET
    @Path("ok/json")
    public Response getBookJSON() {
        Book current = new Book();
        current.setIsbn("1-111111-11");
        current.setName("Harry");
        return Response.status(Response.Status.OK).entity(current).type(MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("error/webapplicationexception")
    public String getBookWithWebApplicationException(@QueryParam("id") String id) {
        if (null == id) {
            throw new BadRequestException();
        }
        return "Java For Life" + id;
    }

    @GET
    @Path("error")
    public Response getBookWithError(@QueryParam("id") String id) {
        if (null == id) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.OK).entity("Java For Life" + id).build();
    }
}

