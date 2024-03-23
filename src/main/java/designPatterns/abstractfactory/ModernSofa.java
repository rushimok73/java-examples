package designPatterns.abstractfactory;

public class ModernSofa implements Sofa{
    @Override
    public Integer numberOfPeopleItCanSeat() {
        return 3;
    }

    @Override
    public String description() {
        return "This is a smaller sofa, made in the 2000s";
    }
}
