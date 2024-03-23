package designPatterns.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public Integer numLegs() {
        return 4;
    }

    @Override
    public String description() {
        return "This is a modern Chair, made in the 2000s";
    }
}
