package com.company;

public class CarDemo {

    public static void main(String[] args) {
	Car myCar = new Car ();
    myCar.setMake("Ford");
    myCar.setModel("Bronco");

    System.out.println(myCar.getMake() + " " + myCar.getModel());
    //System.out.println("The Cars Make is " + myCar.make);
    //System.out.println("The Card Model is " + myCar.model);

    myCar.getCarDetails();

    }
}
