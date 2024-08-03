// Vehicle class is the base class for all vehicles
public abstract class Vehicle {
    private final String licensePlate; // the license plate number

    // constructor for the Vehicle class
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    //getter
    public String getLicensePlate() {
        return licensePlate;
    }
    //To string method
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [licensePlate=" + licensePlate + "]";
    }
}
