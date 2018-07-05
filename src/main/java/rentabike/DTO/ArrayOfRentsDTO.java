package rentabike.DTO;

import java.util.List;

public class ArrayOfRentsDTO {

    private List<RentDTO> rents;
    private Double price;
    private Boolean valid;
    private List<String> messagesError;
    private List<String> messagesOK;

    public List<RentDTO> getRents() {
        return rents;
    }

    public void setRents(List<RentDTO> rents) {
        this.rents = rents;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<String> getMessagesError() {
        return messagesError;
    }

    public void setMessagesError(List<String> messagesError) {
        this.messagesError = messagesError;
    }

    public List<String> getMessagesOK() {
        return messagesOK;
    }

    public void setMessagesOK(List<String> messagesOK) {
        this.messagesOK = messagesOK;
    }
}
