package designPatterns.abstractfactory;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        Chair c = factory.createChair();
        Sofa s = factory.createSofa();

        System.out.println(c.description() + " " + c.numLegs());
        System.out.println(s.description() + " " + s.numberOfPeopleItCanSeat());

        factory = new VictorianFactory();
        c = factory.createChair();
        s = factory.createSofa();

        System.out.println(c.description() + " " + c.numLegs());
        System.out.println(s.description() + " " + s.numberOfPeopleItCanSeat());
    }
}
