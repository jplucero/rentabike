package rentabike.model;

import java.util.Date;

public class Rent {

    private long id;
    private Customer customer;
    private Bike bike;
    private RentType rentType;
    private Short timeAmount;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Short getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(Short timeAmount) {
        this.timeAmount = timeAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
