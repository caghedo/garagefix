package com.qa.garage;

public class Car extends Vehicle {

	private boolean manual;
	private String model;
	private int age;

	public Car(boolean manual, String model, int age) {
		super();
		this.manual = manual;
		this.model = model;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Car [manual=" + manual + ", model=" + model + ", age=" + age + "]";
	}

	@Override
	public String FixVehicle() {
		int cost1;
		int cost2;
		if (manual == true) {
			cost1 = 150;
		} else {
			cost1 = 500;
		}

		if (age < 40) {
			cost2 = 400;
		} else {
			cost2 = 200;
		}
		int cost3 = cost1 + cost2;
		return "Your vehicle will be repaired for " + "£ " + cost3;
	}

}
