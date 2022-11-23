/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Model.Result;
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
@Path("ftoc")
public class FtoC {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FtoC
     */
    public FtoC() {
    }

    /**
     * Retrieves representation of an instance of services.FtoC
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{farenheit}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml(@PathParam("farenheit") double farenheit) {
        //TODO return proper representation object
        double celsius = (5/9.0) * (farenheit - 32);
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setCelsius(celsius);
        JAXB.marshal(result, writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of FtoC
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
