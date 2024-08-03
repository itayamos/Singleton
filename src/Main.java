public class Main {
    public static void main(String[] args) {
        // Initialize the ParkingLotManager with 5 available spaces
        ParkingLotManager manager = ParkingLotManager.getInstance(5);

        // Create different types of vehicles using the VehicleFactory
        Vehicle car = VehicleFactory.createVehicle("car", "123-ABC");
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle", "456-DEF");
        Vehicle truck = VehicleFactory.createVehicle("truck", "789-GHI");

        // Park the vehicles in the parking lot
        manager.parkVehicle(car);
        manager.parkVehicle(motorcycle);
        manager.parkVehicle(truck);

        // Vehicles leave the parking lot
        manager.leaveVehicle(car);
        manager.leaveVehicle(motorcycle);

        // Create another car and park it in the parking lot
        Vehicle anotherCar = VehicleFactory.createVehicle("car", "101-JKL");
        manager.parkVehicle(anotherCar);
    }
}