package designPatterns.builder;

public class House {
    private int doors;
    private int windows;
    private boolean hasLawn;
    private boolean isFurnished;
    private int numRooms;

    private House(HouseBuilder hb) {
        this.doors = hb.doors;
        this.windows = hb.windows;
        this.numRooms = hb.numRooms;
        this.isFurnished = hb.isFurnished;
        this.hasLawn = hb.hasLawn;
    }

    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors +
                ", windows=" + windows +
                ", hasLawn=" + hasLawn +
                ", isFurnished=" + isFurnished +
                ", numRooms=" + numRooms +
                '}';
    }

    public static class HouseBuilder {
        // required
        private int doors;
        private int windows;
        private int numRooms;

        //optional
        private boolean hasLawn = false;
        private boolean isFurnished = false;

        public HouseBuilder(int doors, int numRooms, int windows) {
            this.doors = doors;
            this.numRooms = numRooms;
            this.windows = windows;
        }

        public HouseBuilder setHasLawn(boolean hasLawn) {
            this.hasLawn = hasLawn;
            return this;
        }

        public HouseBuilder setIsFurnished(boolean isFurnished) {
            this.isFurnished = isFurnished;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
