import org.junit.Test;
import rentabike.DTO.BikeDTO;
import rentabike.DTO.CustomerDTO;
import rentabike.bussiness.CustomerBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    public Integer id = 1;
    CustomerBean bean = new CustomerBean();

    @Test
    public void getCustomerTest() {
        CustomerDTO customer = bean.getCustomer(id);
        assertEquals(true, customer.getId() == id) ;
    }

    @Test
    public void getAllCustomerTest() {
        List<CustomerDTO> customers = bean.geCustomerList();
        assertEquals(true ,customers.size() > 0);
    }
}
