package com.qa.garage;

public class Main {

	public static void main(String[] args) {
	Car Car1=new Car(true,"Toyata",50);
	Motorbike Bike1=new Motorbike(180,false,"Mitsubushi");
	Motorbike Bike2=new Motorbike(110,true,"Viper");
	Garage.addVehicle(Bike2);
	Garage.addVehicle(Bike1);
	Garage.addVehicle(Car1);
	Garage.getVehicle(2);
	
		
		
		
		
	}
}
