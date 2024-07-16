package web.model;

public class Car {
    private final String make;
    private final String model;
    private final int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }
}
