package designPatterns.abstractfactory;

public class VictorianChair implements Chair{
    @Override
    public Integer numLegs() {
        return 4;
    }

    @Override
    public String description() {
        return "This is a victorian chair made in the 1600s";
    }
}
