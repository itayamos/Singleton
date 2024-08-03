// VehicleFactory class demonstrates the Factory pattern for creating vehicles
public class VehicleFactory {
    // Static method to create a vehicle based on type and license plate
    public static Vehicle createVehicle(String type, String licensePlate) {
        // Use switch-case to decide which type of vehicle to create,
        // more efficient than using if / else
        return switch (type.toLowerCase()) {
            case "car" -> new Car(licensePlate); // Create a Car
            case "motorcycle" -> new Motorcycle(licensePlate); // Create a motorcycle
            case "truck" -> new Truck(licensePlate); // Create a truck
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + type);
            // If the type is unknown, throw an exception
        };
    }
}

