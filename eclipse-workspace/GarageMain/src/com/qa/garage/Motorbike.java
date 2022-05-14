package com.qa.garage;

public class Motorbike extends Vehicle {

	private int horsepower;
	private boolean electric;
	private String model;

	public Motorbike(int horsepower, boolean electric, String model) {
		super();
		this.horsepower = horsepower;
		this.electric = electric;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Motorbike [horsepower=" + horsepower + ", electric=" + electric + ", model=" + model + "]";
	}

	@Override
	public String FixVehicle() {
		int cost1;
		int cost2;
		if (electric == true) {
			cost1 = 700;
		} else {
			cost1 = 200;
		}

		if (horsepower > 120) {
			cost2 = 300;
		} else {
			cost2 = 600;
		}
		int cost3 = cost1 + cost2;
		return "Your motorbike will be repaired for " + "£ " + cost3;
	}

}
