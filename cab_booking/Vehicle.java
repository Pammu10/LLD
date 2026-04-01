//Vehicle.java

public class Vehicle{
    private String model;
    private String plateNumber;
    public Vehicle(String model, String plateNumber){
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public String getModel(){
        return model;
    }
    public String getPlateNumber(){
        return plateNumber;
    }
}