package com.company;

public class Main {

    public static void main(String[] args) {
		Car car1 = new Car("Mazah3", "Skyativ3");
		car1.display();
		System.out.println(Car.numberOfCars);
		Car car2 = new Car("Mazah6", "Skyactiv6");
		car2.display();
		System.out.println(Car.getNumberOfCars());
		Car car3 = new Car("Mazah9", "Skyactiv8");
		car3.display();
		System.out.println(Car.numberOfCars);
	}

}

