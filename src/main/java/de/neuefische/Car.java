package de.neuefische;

public class Car extends Vehicle{

    private int numOfDoors;


    public Car(String model, String manufacturer, int yearOfManufacture, double price, int numOfDoors) {

        super(model, manufacturer, yearOfManufacture, price);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numOfDoors=" + numOfDoors +
                "} " + super.toString();
    }
}

