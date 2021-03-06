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
        CustomerDTO customer = new CustomerDTO();
        /* DB CALL */
        customer.setId(id);
        return customer;
    }

    /**
     *
     * @return List<CustomerDTO>
     * @author Juan Pablo Lucero
     * Get the avilable customer list for a bike rental.
     */

    public List<CustomerDTO> geCustomerList (){
        List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
        CustomerDTO customer = new CustomerDTO();
        /* DB CALL */
        customer.setId(1);
        customerList.add(customer);
        return customerList;
    }

}
