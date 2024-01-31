package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle("model1","manu1",1,1);
        System.out.println(vehicle);

        Car car=new Car("model2","manu2",2,2,2);
        System.out.println(car);
    }
}