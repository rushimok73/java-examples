package functionalInterfacesAndLambdas;

public class Runner {
    public void run() {
        MyFunctional<Integer, Long> add = (a, b) -> Long.valueOf(a + b);
        MyFunctional<Integer, Long> subtract = (a, b) -> Long.valueOf(a - b);
        MyFunctional<Integer, Long> divide = (a, b) -> Long.valueOf(a / b);
        MyFunctional<Integer, Long> multiply = (a, b) -> Long.valueOf(a * b);

        Calculator c = new Calculator();
        c.calculate(10, 2, add);
        c.calculate(10, 2, subtract);
        c.calculate(10, 2, divide);
        c.calculate(10, 2, multiply);
    }
}
