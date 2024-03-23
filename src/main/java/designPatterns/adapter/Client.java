package designPatterns.adapter;

public class Client {
    public void doSomething(ExistingService s) {
        s.serviceFunction();
    }
}
