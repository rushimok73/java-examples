package designPatterns.abstractfactory;

public class VictorianSofa implements Sofa {
    @Override
    public Integer numberOfPeopleItCanSeat() {
        return 5;
    }

    @Override
    public String description() {
        return "This is a bigger sofa made in the 1600s";
    }
}
