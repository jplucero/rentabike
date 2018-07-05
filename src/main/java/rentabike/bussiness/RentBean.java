package rentabike.bussiness;

import rentabike.DTO.ArrayOfRentsDTO;
import rentabike.DTO.BikeDTO;
import rentabike.DTO.Message;
import rentabike.DTO.RentDTO;
import rentabike.config.BussinessConf;
import rentabike.interfaces.IRent;

import java.util.ArrayList;
import java.util.List;

public class RentBean implements IRent {

public ArrayOfRentsDTO addRents (ArrayOfRentsDTO rents){
    ArrayOfRentsDTO newRents = new ArrayOfRentsDTO();
    try {
        newRents = validateRents(rents);
        if (newRents.getValid()) {

            /* DB CALL */
        }
    }
    catch (Exception ex){
        List<String> errorList = new ArrayList<String>();
        errorList.add(Message.RENT_ERROR);
        newRents.setMessagesError(errorList);
    }
    return newRents;
}

public ArrayOfRentsDTO validateRents (ArrayOfRentsDTO rents){
    ArrayOfRentsDTO arrayOfRents = new ArrayOfRentsDTO();
    List<RentDTO> listRent = new ArrayList<RentDTO>();
    Double finalPrice = 0.0;
    Integer rentsSize = rents.getRents().size();
    List<String> messagesErrorRent = new ArrayList<String>();
    List<String> messagesError = new ArrayList<String>();
    List<String> messagesOK = new ArrayList<String>();
    if (rentsSize <= BussinessConf.MAX_RENT_PURCHASE){
        for (RentDTO rent : rents.getRents()) {
            BikeBean bikeBean = new BikeBean();
            rent.setValid(false);
            BikeDTO bike = bikeBean.getBike(rent.getBike().getId());
            if (!bike.getAvailable()) {
                messagesErrorRent.add(Message.RENT_ERROR);
            }
            rent.setMessagesError(messagesErrorRent);
            if (messagesErrorRent.size() == 0) {
                rent.setValid(true);
                rent.setPrice(calculatePrice(rent, rentsSize));
                finalPrice+= rent.getPrice();
            }
            listRent.add(rent);
        }
    }
    else {
        messagesError.add(Message.RENT_ERROR);
   }
    arrayOfRents.setValid(messagesErrorRent.size() == 0 && messagesError.size() == 0);
    if (arrayOfRents.getValid()){
        arrayOfRents.setPrice(finalPrice);
        messagesOK.add(Message.RENT_OK);
        arrayOfRents.setRents(listRent);
    }
    return arrayOfRents;
}

public Double calculatePrice (RentDTO rent, Integer size){
    Double price = 0.0;
    price = rent.getRentType().getPrice() * rent.getTimeAmount();
    if (size > BussinessConf.MIN_RENT_FAMILY) {
        price = price * BussinessConf.RENT_FAMILY_DISCOUNT;
    }
    return price;
}

}
