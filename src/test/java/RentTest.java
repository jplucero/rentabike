import org.junit.Test;
import rentabike.DTO.*;
import rentabike.bussiness.RentBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class RentTest {

    private RentDTO newRent(){
        RentDTO rent = new RentDTO();

        CustomerDTO customer1 = new CustomerDTO();
        customer1.setId(1);
        rent.setCustomer(customer1);

        BikeDTO bike1 = new BikeDTO();
        bike1.setId(1);
        rent.setBike(bike1);

        rent.setDate(new Date());
        rent.setTimeAmount((short)1);

        RentTypeDTO rentType = new RentTypeDTO();
        rentType.setId((short)1);
        rentType.setPrice((double)5);

        rent.setRentType(rentType);

        return rent;
    }



    @Test
    public void addRentsTestOK() {

        ArrayOfRentsDTO rents = new ArrayOfRentsDTO();
        List<RentDTO> list = new ArrayList<RentDTO>();
        list.add(newRent());
        rents.setRents(list);

        RentBean bean = new RentBean();
        rents = bean.addRents(rents);
        assertEquals(true, rents.getValid());

    }

    @Test
    public void addRentsTestMaxRentsError() {

        ArrayOfRentsDTO rents = new ArrayOfRentsDTO();
        List<RentDTO> list = new ArrayList<RentDTO>();
        for (int i=0;i<7;i++) {
            list.add(newRent());
        }
        rents.setRents(list);

        RentBean bean = new RentBean();
        rents = bean.addRents(rents);
        assertEquals(false, rents.getValid());

    }

    @Test
    public void addRentsTestPrice() {

        ArrayOfRentsDTO rents = new ArrayOfRentsDTO();
        List<RentDTO> list = new ArrayList<RentDTO>();
        for (int i=0;i<2;i++) {
            list.add(newRent());
        }
        rents.setRents(list);

        RentBean bean = new RentBean();
        rents = bean.addRents(rents);
        assert(rents.getPrice() == (double)10);

    }

    @Test
    public void addRentsTestPriceDiscount() {

        ArrayOfRentsDTO rents = new ArrayOfRentsDTO();
        List<RentDTO> list = new ArrayList<RentDTO>();
        for (int i=0;i<5;i++) {
            list.add(newRent());
        }
        rents.setRents(list);

        RentBean bean = new RentBean();
        rents = bean.addRents(rents);
        assert(rents.getPrice() == 17.5);

    }

    @Test
    public void addRentsTestError() {

        ArrayOfRentsDTO rents = new ArrayOfRentsDTO();

        RentBean bean = new RentBean();
        rents = bean.addRents(rents);
        assert(rents.getMessagesError().size() > 0);

    }



}
