package rentabike.exceptions;

public class RentException extends Exception{

    /**
     * @author Juan Pablo Lucero
     * A custom exception class.
     */

    private static final String RENT_ERROR = "Application error";

        public RentException() {
            super(RENT_ERROR);
        }

}
