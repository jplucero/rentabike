package rentabike.services;

import rentabike.DTO.BikeDTO;
import rentabike.bussiness.BikeBean;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/bikes")
public class BikeService {

    @Inject
    BikeBean bikeBean;

    /**
     *
     * @param servletRequest
     * @param id
     * @return BikeDTO
     * @author Juan Pablo Lucero
     * Gets a bike by id.
     */

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBike (@Context HttpServletRequest servletRequest, @PathParam("id") Integer id) {
        BikeDTO bike = bikeBean.getBike(id);
        return Response.status(200).entity(bike).build();
    }

    /**
     *
     * @param servletRequest
     * @return List<BikeDTO>
     * @author Juan Pablo Lucero
     * Gets a list of available bikes for rental.
     */

    @GET
    @Path("/get/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBikes (@Context HttpServletRequest servletRequest) {
        List<BikeDTO> bikes = bikeBean.getBikeList();
        return Response.status(200).entity(bikes).build();
    }

}
