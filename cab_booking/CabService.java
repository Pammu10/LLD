public class CabService {
    private HashMap<String, User> users;
    private HashMap<String, Driver> drivers;
    private HashMap<String, Ride> activeRides;
    private static final double MAX_DRIVER_DISTANCE = 5.0;
    private static final double RATE_PER_UNIT = 2.0;
    public CabService() {
    this.users = new HashMap<>();
    this.drivers = new HashMap<>();
    this.activeRides = new HashMap<>();
}
    public void add_user(String name, int age, Gender gender){
        User user = new User(name, age, gender);
        if (!users.containsKey(name)) {
    users.put(name, user);  // key is name, value is user
}
    }
    public void update_user(String name){
        User userFound = users.get(name);
        user.update(newAge);
        //update
    }

    public void update_userLocation(String name, Location location){
        User userFound = users.get(name);
        userFound.setLocation(location.getX(), location.getY());
    }

    public void add_driver(String name, Gender gender, int age, String modelNo, String plateNumber, double[] location){
        Driver driver = new Driver(name, gender, age, modelNo, plateNumber, location);
        if (!drivers.containsKey(name)){
            drivers.put(name, driver);
        }
    }

    public void update_driverLocation(String name, Location location){
        Driver driverFound = drivers.get(name);
        driverFound.setLocation(location);
    }

    public void change_driver_status(String name, DriverStatus status){
        Driver driverFound = drivers.get(name);
        driverFound.setStatus(status);
    }

    public List<Driver> find_ride(String username, Location source, Location destination){
        //loop over drivers map and check if available plus distance within bounds.
        //return all valid drivers
        User user = users.get(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found: " + username);
        }

        List<Driver> availableDrivers = new ArrayList<>();
        for (Driver driver : drivers.values()){
            if (driver.getStatus() == DriverStatus.AVAILABLE){
                if (driver.getLocation().distanceTo(user.getLocation()) < 5){
                    availableDrivers.add(driver);
                }
            }
        }
        return availableDrivers;
    } 
    public void choose_ride(String username, String driverName, Location source, Location destination){
        User user = users.get(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found: " + username);
        }

        Driver driver = drivers.get(driverName);
        driver.setStatus(DriverStatus.UNAVAILABLE);
        Ride ride = new Ride(user, driver, source, destination);
        activeRides.put(username, ride);
    }
    public void calculateBill(String username){
        Ride ride = activeRides.get(username);
        if (ride == null) {
            throw new IllegalArgumentException("No active ride for: " + username);
        }
        double distance = ride.getSource().distanceTo(ride.getDestination());
        update_userLocation(username, ride.getDestination());
        update_driverLocation(ride.getDriver().getName(), ride.getDestination());
        double bill = distance * 2;
        ride.setBill(bill);
        ride.setStatus(RideStatus.COMPLETED);
        ride.getDriver().addEarning(bill);
        activeRides.remove(username);
    }
    public void find_total_earning(){
        for (Driver driver : drivers.values()) {
        System.out.println(driver.getName() + " earned $" + driver.getTotalEarnings());
        }
    }
}