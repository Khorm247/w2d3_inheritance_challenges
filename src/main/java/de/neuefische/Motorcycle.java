package de.neuefische;

public class Motorcycle extends Vehicle {
    private int numberWheels;
    private String type;


    public Motorcycle(String model, String manufacturer, int yearOfManufacture, double price, int numberWheels, String type) {
        super(model, manufacturer, yearOfManufacture, price);
        this.numberWheels = numberWheels;
        this.type = type;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "numberWheels=" + numberWheels +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}

