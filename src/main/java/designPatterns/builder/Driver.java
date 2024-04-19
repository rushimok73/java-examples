package designPatterns.builder;

public class Driver {
    public static void main(String[] args) {
        House h = new House.HouseBuilder(1, 4, 10)
                .setHasLawn(true)
                .setIsFurnished(true)
                .build();
        System.out.println(h.toString());
    }

}
