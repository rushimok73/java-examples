package designPatterns.adapter;

public class Driver {
    public static void main(String[] args) {
        ExistingService s = new ExistingService();
        NewServiceAdapter nsa = new NewServiceAdapter(new NewService());

        Client c = new Client();
        c.doSomething(s);
        c.doSomething(nsa);
    }
}
