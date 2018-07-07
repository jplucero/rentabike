package rentabike.services;


import rentabike.DTO.ArrayOfRentsDTO;
import rentabike.bussiness.RentBean;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/rents")

public class RentBikeService {

    @Inject
    RentBean rentBean;

    /**
     *
     * @param rents
     * @return ArrayOfRentsDTO
     * @author  Juan Pablo Lucero
     * This rest receives a collection of rents in order to interact with the bussiness layer expecting a purchase result for those rents.
     */

    @POST
    @Path("/new")
    public Response printMessage(@QueryParam("rents") ArrayOfRentsDTO rents) {
        rents = rentBean.addRents(rents);
        return Response.status(200).entity(rents).build();
    }


}
