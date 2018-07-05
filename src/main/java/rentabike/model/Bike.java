package rentabike.model;

public class Bike {

    private Short id;
    private BikeModel bikeModel;
    private BikeStatus bikeStatus;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public BikeModel getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(BikeModel bikeModel) {
        this.bikeModel = bikeModel;
    }

    public BikeStatus getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(BikeStatus bikeStatus) {
        this.bikeStatus = bikeStatus;
    }
}
