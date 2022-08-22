package fr.m2i.javarest.api.bookAPI;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book/contentbooks")
public class BookContentResource {

    /**
     * URI: /xml
     */
    @Path("xml")
    @Consumes(MediaType.APPLICATION_XML)
    @PUT
    public void updateContentBookWithXML(Book current) throws IOException {
        System.out.println("BookContentResource.updateContentBooksWithXML()");

        System.out.println("Name: " + current.getName() + ", ISBN: " + current.getIsbn());
    }

    /**
     * URI: /xml
     */
    @Path("xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Book getContentBookWithXML() {
        System.out.println("BookContentResource.getContentBooksWithXML()");

        Book current = new Book();
        current.setIsbn("1-111111-11");
        current.setName("Harry");

        return current;
    }

    /**
     * URI: /json
     */
    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getContentBookWithJSON() {
        System.out.println("BookContentResource.getContentBooksWithJSON()");

        Book current = new Book();
        current.setIsbn("1-111111-11");
        current.setName("Harry");

        return current;
    }

    /**
     * URI: /jsonxml
     */
    @Path("jsonxml")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Book getContentBookWithJSONAndXML() {
        System.out.println("BookContentResource.getContentBooksWithJSONAndXML()");

        Book current = new Book();
        current.setIsbn("1-111111-11");
        current.setName("Harry");

        return current;
    }

    /**
     * URI: /json
     */
    @Path("json")
    @Consumes(MediaType.APPLICATION_JSON)
    @PUT
    public void updateContentBookWithJSON(Book current) throws IOException {
        System.out.println("BookContentResource.updateContentBooksWithJSON()");

        System.out.println("Name: " + current.getName() + ", ISBN: " + current.getIsbn());
    }

    /**
     * URI: /
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getContentBooksWithJSON() {
        System.out.println("BookContentResource.getBooksWithJSON()");

        Book book1 = new Book();
        book1.setIsbn("1-111111-11");
        book1.setName("Harry");

        Book book2 = new Book();
        book2.setIsbn("1-111111-11");
        book2.setName("Harry");

        return Arrays.asList(book1, book2);
    }
}
