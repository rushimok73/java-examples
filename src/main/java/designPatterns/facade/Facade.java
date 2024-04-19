package designPatterns.facade;

public class Facade {
    public void convenientMethod(int type) {
        Object c = null;
        if(type == 1) {
            c = new ComplexExternalClass1();
        } else if(type == 2) {
            c = new ComplexExternalClass2();
        } else {
            c = new ComplexExternalClass3();
        }
        System.out.println(c.toString());
    }
}
