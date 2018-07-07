package rentabike.bussiness;

import rentabike.DTO.BikeDTO;

import java.util.ArrayList;
import java.util.List;

public class BikeBean {

    /**
     *
     * @param id
     * @return BikeDTO
     * @author Juan Pablo Lucero
     * Gets an specific bike from data layer.
     */

    public BikeDTO getBike (Integer id){
        BikeDTO bike = new BikeDTO();
        /* DB CALL */
        bike.setAvailable(true);
        return bike;
    }

    /**
     *
     * @return List<BikeDTO>
     * @author Juan Pablo Lucero
     * Gets a list of available bikes for rental.
     */

    public List<BikeDTO> getBikeList (){
        List<BikeDTO> bikeList = new ArrayList<BikeDTO>();
        /* DB CALL */
        return bikeList;
    }

}
