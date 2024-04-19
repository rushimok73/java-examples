package designPatterns.factory;

public class Bike implements Vehicle{
    @Override
    public int numWheels() {
        return 2;
    }

    @Override
    public void description() {
        System.out.println("Bike goes vroom vroom");
    }
}
