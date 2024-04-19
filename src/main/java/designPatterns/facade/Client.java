package designPatterns.facade;

public class Client {
    public static void main(String[] args) {
        //instead of
        int type = 2;

        Object c = null;
        if(type == 1) {
            c = new ComplexExternalClass1();
        } else if(type == 2) {
            c = new ComplexExternalClass2();
        } else {
            c = new ComplexExternalClass3();
        }
        System.out.println(c.toString());

        //we can
        new Facade().convenientMethod(type);
    }
}
