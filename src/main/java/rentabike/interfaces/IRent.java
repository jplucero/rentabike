package rentabike.interfaces;

import rentabike.DTO.ArrayOfRentsDTO;
import rentabike.DTO.RentDTO;

import java.util.List;

public interface IRent {

    public Double calculatePrice(RentDTO rent, Integer size);
    public ArrayOfRentsDTO validateRents (ArrayOfRentsDTO rents);
    public ArrayOfRentsDTO addRents (ArrayOfRentsDTO rents);
}
