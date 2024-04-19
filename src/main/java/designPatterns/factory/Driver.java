package designPatterns.factory;

public class Driver {
    public static void main(String[] args) {
        VehicleFactory f = new VehicleFactory();
        f.getVehicle(2).description();
        f.getVehicle(4).description();
    }
}
