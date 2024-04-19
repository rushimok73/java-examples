package designPatterns.factory;

public class Car implements Vehicle{
    @Override
    public int numWheels() {
        return 4;
    }

    @Override
    public void description() {
        System.out.println("Car goes peep peep");
    }
}
