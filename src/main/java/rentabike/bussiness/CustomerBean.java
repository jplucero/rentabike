package rentabike.bussiness;

import rentabike.DTO.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerBean {

    /**
     *
     * @param id
     * @return CustomerDTO
     * @author Juan Pablo Lucero
     * Gets a customer from DB layer.
     */

    public CustomerDTO getCustomer (Integer id){
        CustomerDTO bike = new CustomerDTO();
        /* DB CALL */
        return bike;
    }

    /**
     *
     * @return List<CustomerDTO>
     * @author Juan Pablo Lucero
     * Get the avilable customer list for a bike rental.
     */

    public List<CustomerDTO> geCustomerDTOList (){
        List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
        /* DB CALL */
        return customerList;
    }

}
