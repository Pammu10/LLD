public class CabService {
    private HashMap<String, User> users;
    private HashMap<String, Driver> drivers;
    private HashMap<String, Ride> activeRides;
    public CabService() {
    this.users = new HashMap<>();
    this.drivers = new HashMap<>();
    this.activeRides = new HashMap<>();
}
    // Write the method signatures for:
    // add_user, update_user, update_userLocation
    // add_driver, update_driverLocation, change_driver_status
    // find_ride, choose_ride, calculateBill, find_total_earning
    public void add_user(String name, int age, Gender gender){
        User user = new User(name, age, gender);
        if (!users.containsKey(name)) {
    users.put(name, user);  // key is name, value is user
}
    }
    public void update_user(String name){
        User userFound = users.get(name);
        //update
    }

    public void update_userLocation(String name, Location location){
        User userFound = users.get(name);
        userFound.setLocation(Location.getX(), Location.getY());
    }

    public void add_driver(String name, Gender gender, int age, String modelNo, String plateNumber, double[] location){
        Driver driver = new Driver(name, gender, age, modelNo, plateNumber, location);
        if (!drivers.containsKey(driver)){
            drivers.put(name, driver);
        }
    }

    public void update_driverLocation(String name, Location location){
        Driver driverFound = drivers.get(name);
        driverFound.setLocation(location);
    }

    public void change_driver_status(string name, DriverStatus status){
        Driver driverFound = drivers.get(name);
        driverFound.setStatus(status);
    }

    public List<Driver> find_ride(String username, Location source, Location destination){
        //loop over drivers map and check if available plus distance within bounds.
        //return all valid drivers
    } 
    public void choose_ride(String username, String driverName){
        //check valid
        activeRides.put(name, )
    }
    public void calculateBill(String username){
        Ride ride = activeRides.get(username);
        double distance = ride.getSource().distanceTo(ride.getDestination());
        update_userLocation(ride.getDestination());
        update_driverLocation(ride.getDestination());
    }
    public double find_total_earning(){
        
    }
}