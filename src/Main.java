public class Main {
    public static void main(String[] args) {
        ParkingLotManager manager = ParkingLotManager.getInstance(5);

        Vehicle car = VehicleFactory.createVehicle("car", "123-ABC");
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle", "456-DEF");
        Vehicle truck = VehicleFactory.createVehicle("truck", "789-GHI");

        manager.parkVehicle(car);
        manager.parkVehicle(motorcycle);
        manager.parkVehicle(truck);

        manager.leaveVehicle(car);
        manager.leaveVehicle(motorcycle);

        Vehicle anotherCar = VehicleFactory.createVehicle("car", "101-JKL");
        manager.parkVehicle(anotherCar);
    }
}