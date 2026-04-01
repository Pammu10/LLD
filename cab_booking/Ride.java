//Ride.java

public class Ride{
    private User user;
    private Driver driver;
    private Location source;
    private Location destination;
    private RideStatus status;
    private double bill;

    public Ride(User user, Driver driver, Location source, Location destination){
        
        this.user = user;
        this.driver = driver;
        this.source = source;
        this.destination = destination;
        this.status = RideStatus.STARTED;
        this.bill = 0;
    }

    public void setBill(double bill){
        this.bill = bill;

    }

    public setStatus(RiderStatus status){
        this.status = status;
    }

    public User getUser() { return user; }
    public Driver getDriver() { return driver; }
    public RideStatus getStatus() { return status; }
    public Location getSource() { return source; }
    public Location getDestination() { return destination; }
    public double getBill() { return bill; }
}