package rentabike.services;

import rentabike.DTO.CustomerDTO;
import rentabike.bussiness.CustomerBean;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/customers")
public class CustomerService {

    @Inject
    CustomerBean customerBean;

    /**
     *
     * @param servletRequest
     * @param id
     * @return CustomerDTO
     * @author Juan pablo Lucero
     * Gets a customer by id.
     */

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomer (@Context HttpServletRequest servletRequest, @PathParam("id") Integer id) {
        CustomerDTO bike = customerBean.getCustomer(id);
        return Response.status(200).entity(bike).build();
    }

    /**
     *
     * @param servletRequest
     * @return List<CustomerDTO>
     * @author Juan pablo Lucero
     * Gets a list of available customer for bike rental.
     */

    @GET
    @Path("/get/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBikes (@Context HttpServletRequest servletRequest) {
        List<CustomerDTO> bikes = customerBean.geCustomerList();
        return Response.status(200).entity(bikes).build();
    }

}
