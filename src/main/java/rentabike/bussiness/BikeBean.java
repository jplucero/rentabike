package rentabike.bussiness;

import rentabike.DTO.BikeDTO;

import java.util.ArrayList;
import java.util.List;

public class BikeBean {

    public BikeDTO getBike (Integer id){
        BikeDTO bike = new BikeDTO();
        /* DB CALL */
        bike.setAvailable(true);
        return bike;
    }

    public List<BikeDTO> getBikeList (){
        List<BikeDTO> bikeList = new ArrayList<BikeDTO>();
        /* DB CALL */
        return bikeList;
    }

}
