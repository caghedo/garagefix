package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	public static ArrayList<Vehicle> Garage = new ArrayList();

	public static void addVehicle(Vehicle vehicle) {
		Garage.add(vehicle);
		System.out.println("Vehicle added");
	}

	public static void removeVehicle(Vehicle vehicle) {
		for (int x = 0; x < Garage.size(); x++) {
			if (vehicle == Garage.get(x)) {
				Garage.remove(vehicle);
			} else {
				System.out.println("Vehicle not found");
			}
		}
	}

	public static void fixtheVehicle(Vehicle vehicle) {
		for (int x = 0; x < Garage.size(); x++) {
			if (vehicle == Garage.get(x)) {
				System.out.println(vehicle.FixVehicle());
				Garage.remove(x);
			} else {
				System.out.println("Vehicle not found");
			}

		}
	}

	public static void getVehicle(int x) {
		System.out.println(Garage.get(x));
	}
}