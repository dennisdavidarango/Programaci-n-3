/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinarioweb.webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import proyectoarboln.modelo.Empleado;
import proyectoarboln.modelo.Ciudad;


/**
 * REST Web Service
 *
 * @author walterarango
 */
@Path("empleadows")
public class WsEmpleado {
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WsEmpleado
     */
    public WsEmpleado() {
    }

    /**
     * Retrieves representation of an instance of arbolbinarioweb.webservice.WsEmpleado
     * @return an instance of proyectoarboln.modelo.Empleado
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Empleado getJson() {
        //TODO return proper representation object

        throw new UnsupportedOperationException();

    }

    /**
     * PUT method for updating or creating an instance of WsEmpleado
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Empleado content) {
    }
}
