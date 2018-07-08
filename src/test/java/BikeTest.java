import org.junit.Test;
import rentabike.DTO.BikeDTO;
import rentabike.bussiness.BikeBean;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BikeTest {

    public Integer id = 1;
    BikeBean bean = new BikeBean();

    @Test
    public void getBikeTest() {
        BikeDTO bike =  bean.getBike(id);
        assertEquals(true, bike.getAvailable());
    }

    @Test
    public void getAllBikeTest() {
        List<BikeDTO> bikes = bean.getBikeList();
        assertEquals(true ,bikes.size() > 0);
    }


}


