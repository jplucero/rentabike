package rentabike.exceptions;

public class RentException extends Exception{

    private static final String RENT_ERROR = "Application error";

        public RentException() {
            super(RENT_ERROR);
        }

}
