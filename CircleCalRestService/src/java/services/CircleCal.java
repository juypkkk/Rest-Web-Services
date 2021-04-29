/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;
import model.Result;

/**
 * REST Web Service
 *
 * @author Patarakorn
 */
@Path("circlecal")
public class CircleCal {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CircleCal
     */
    public CircleCal() {
    }

    /**
     * Retrieves representation of an instance of services.CircleCal
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{rad}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml(@PathParam("rad") double rad) {
        double area = 3.14*rad*rad;
        double circu = 2*3.14*rad;
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setArea(area);
        result.setCircu(circu);
        JAXB.marshal(result,writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of CircleCal
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
