package rentabike.interfaces;

import rentabike.DTO.ArrayOfRentsDTO;
import rentabike.DTO.RentDTO;
import rentabike.interceptor.LoggingInterceptor;

import javax.interceptor.Interceptors;

@Interceptors(LoggingInterceptor.class)
public interface IRent {

    public Double calculatePrice(RentDTO rent, Integer size);
    public ArrayOfRentsDTO validateRents (ArrayOfRentsDTO rents);
    public ArrayOfRentsDTO addRents (ArrayOfRentsDTO rents);
}
