package functionalInterfacesAndLambdas;

public class Calculator {
    public void calculate(Integer a, Integer b, MyFunctional<Integer, Long> f) {
        System.out.println(f.apply(a, b));
    }
}
