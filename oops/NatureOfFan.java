package com.xworkz.oops;

public class NatureOfFan {

	public static void main(String[] args) {
		
		Fan usha=new Fan();
		usha.brand="USHA fan";
		usha.color="white";
		usha.price=5000;
		usha.numberOfPettals=3;
		
		System.out.println(usha.brand);
		System.out.println(usha.color);
		System.out.println(usha.price);
		System.out.println(usha.numberOfPettals);
		usha.turnOff();
		
		System.out.println();
		
		Fan ceiling=new Fan();
		ceiling.brand="Celing fan";
		ceiling.color="white";
		ceiling.price=5000;
		ceiling.numberOfPettals=3;
		
		System.out.println(ceiling.brand);
		System.out.println(ceiling.color);
		System.out.println(ceiling.price);
		System.out.println(ceiling.numberOfPettals);
		usha.turnOn();
		

	}

}
