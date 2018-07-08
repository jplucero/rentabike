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
        bike.setId(id);
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
        BikeDTO bike = new BikeDTO();
        bike.setId(1);
        bikeList.add(bike);
        /* DB CALL */
        return bikeList;
    }

}
