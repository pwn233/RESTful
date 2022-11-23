/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;



/**
 * REST Web Service
 *
 * @author pwn233 {github.com/pwn233}
 */
@Path("hello")
public class Hello {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Hello
     */
    public Hello() {
    }

    /**
     * Retrieves representation of an instance of services.Hello
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{name}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml(@PathParam("name") String name) {
        //TODO return proper representation object
        StringWriter writer = new StringWriter();
        JAXB.marshal("Hello "+ name, writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of Hello
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
