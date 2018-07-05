package rentabike.DTO;


import java.util.Date;
import java.util.List;

public class RentDTO {

    private Long id;
    private CustomerDTO customer;
    private BikeDTO bike;
    private RentTypeDTO rentType;
    private Short timeAmount;
    private Double price;
    private Boolean valid;
    private List<String> messagesError;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public BikeDTO getBike() {
        return bike;
    }

    public void setBike(BikeDTO bike) {
        this.bike = bike;
    }

    public RentTypeDTO getRentType() {
        return rentType;
    }

    public void setRentType(RentTypeDTO rentType) {
        this.rentType = rentType;
    }

    public Short getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(Short timeAmount) {
        this.timeAmount = timeAmount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public List<String> getMessagesError() {
        return messagesError;
    }

    public void setMessagesError(List<String> messagesError) {
        this.messagesError = messagesError;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
