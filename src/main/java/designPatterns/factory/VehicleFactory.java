package designPatterns.factory;

public class VehicleFactory {
    Vehicle getVehicle(int numWheels) {
        if(numWheels == 2) return new Bike();
        else if(numWheels == 4) return new Car();
        else return null;
    }
}
