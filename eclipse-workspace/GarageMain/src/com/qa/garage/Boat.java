package com.qa.garage;

public class Boat extends Vehicle {

	private int ageHours;
	private boolean outboard;
	private String model;

	public Boat(int ageHours, boolean outboard, String model) {
		super();
		this.ageHours = ageHours;
		this.outboard = outboard;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Boat [ageHours=" + ageHours + ", outboard=" + outboard + ", model=" + model + "]";
	}

	@Override
	public String FixVehicle() {
		int cost1;
		int cost2;
		if (outboard == true) {
			cost1 = 1200;
		} else {
			cost1 = 600;
		}

		if (ageHours >= 300) {
			cost2 = 800;
		} else {
			cost2 = 500;
		}
		int cost3 = cost1 + cost2;
		return "Your vehicle will be repaired for " + "£ " + cost3;
	}

}
