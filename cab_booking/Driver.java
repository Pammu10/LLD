//Driver.java
public class Driver {
    private String driverName;
    private int age;
    private Gender gender;
    private Vehicle vehicle;
    private Location location;
    private DriverStatus status;
    private double totalEarnings;
    public Driver(String driverName, Gender gender, int age, String modelNo, String plateNumber, double[] location){
        this.driverName = driverName;
        this.gender = gender;
        this.age = age;
        Vehicle vehicle = new Vehicle(modelNo, plateNumber);
        this.vehicle = vehicle;
        Location curLocation = new Location(location[0], location[1]);
        this.location = curLocation;
        totalEarnings = 0;
        this.status = DriverStatus.AVAILABLE;

    }

    public void addEarning(double amount){
    this.totalEarnings += amount;
    }
    public String getName() { return name; }
    public Location getLocation() { return location; }
    public DriverStatus getStatus() { return status; }
    public void setStatus(DriverStatus status) { this.status = status; }
    public void setLocation(Location location) { this.location = location; }
    public double getTotalEarnings() { return totalEarnings; }
}