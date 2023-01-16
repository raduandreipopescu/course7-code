package org.fasttrackit.course7.code;

public class Audi {
    private static final String name = "Audi";
    public static int soldCars;
    private int horsePower;
    private long kilometers;

    public Audi(int horsePower, long kilometers) {
        this.horsePower = horsePower;
        this.kilometers = kilometers;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public long getKilometers() {
        return kilometers;
    }

    public void soldCar(){
        soldCars++;
    }

    @Override
    public String toString() {
        return "%s has %s horsePower and %s kilometers.".formatted(name, horsePower, kilometers);
    }
}
