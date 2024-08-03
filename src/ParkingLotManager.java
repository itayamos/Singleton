// ParkingLotManager class demonstrates the Singleton pattern for managing a parking lot
public class ParkingLotManager {
    // Static variable to hold the single instance of the class
    private static ParkingLotManager instance;
    // Variable to keep track of available parking spaces
    private int availableSpaces;

    // Private constructor prevents instantiation from outside the class
    private ParkingLotManager(int spaces) {
        this.availableSpaces = spaces;
    }

    // Static method to return the single instance of the class
    public static ParkingLotManager getInstance(int spaces) {
        // If the instance is not yet created, create it
        if (instance == null) {
            instance = new ParkingLotManager(spaces);
        }
        // Return the single instance
        return instance;
    }

    // Synchronized method to park a vehicle
    public synchronized boolean parkVehicle(Vehicle vehicle) {
        // Check if there are available spaces
        if (availableSpaces > 0) {
            availableSpaces--; // Decrease available spaces by 1
            System.out.println(vehicle + " parked. Available spaces: " + availableSpaces);
            return true;
        } else {
            // If no available spaces, print message and return false
            System.out.println("No available spaces for " + vehicle);
            return false;
        }
    }

    // Synchronized method for a vehicle to leave the parking lot
    public synchronized void leaveVehicle(Vehicle vehicle) {
        availableSpaces++; // The vehicle left therefore, Increase available spaces by 1
        System.out.println(vehicle + " left. Available spaces: " + availableSpaces);
    }

    // Method to get the number of available parking spaces
    public int getAvailableSpaces() {
        return availableSpaces;
    }
}
