package rentabike.bussiness;

import rentabike.DTO.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerBean {

    public CustomerDTO getCustomer (Integer id){
        CustomerDTO bike = new CustomerDTO();
        /* DB CALL */
        return bike;
    }

    public List<CustomerDTO> geCustomerDTOList (){
        List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
        /* DB CALL */
        return customerList;
    }

}
