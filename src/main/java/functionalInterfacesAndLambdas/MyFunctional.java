package functionalInterfacesAndLambdas;

@FunctionalInterface
public interface MyFunctional<T, R> {
    public R apply(T arg1, T arg2);
}
