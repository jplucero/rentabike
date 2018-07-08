package rentabike.data;

import rentabike.DTO.ArrayOfRentsDTO;
import rentabike.DTO.RentDTO;
import rentabike.model.Bike;
import rentabike.model.Customer;
import rentabike.model.Rent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentDAL {

    public ArrayOfRentsDTO instertRent(ArrayOfRentsDTO rents){
        List<Rent> newRents = new ArrayList<Rent>();
        Short id = 1;
        for (RentDTO rent : rents.getRents()){
           newRents.add(castToModel(rent, id));
           id++;
       }
        /* DB CALL */
        return rents;
    }

    private Rent castToModel (RentDTO rent, Short id){
        Rent newRent = new Rent();
        Bike newBike = new Bike();
        Customer newCustomer = new Customer();
        newCustomer.setId(rent.getCustomer().getId());
        newBike.setId(rent.getBike().getId());
        newRent.setBike(newBike);
        newRent.setDate(new Date());
        newRent.setTimeAmount(rent.getTimeAmount());
        newRent.setCustomer(newCustomer);
        /* mockea response DB*/
        newRent.setId(id);
        return newRent;
    }
}
