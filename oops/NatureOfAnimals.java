package com.xworkz.oops;

public class NatureOfAnimals {

	public static void main(String[] args) {
		Animals dog =new Animals();
	    dog.name="MAX";
		dog.age=10;
		dog.price=22345;
		dog.color="white";
		dog.weight=15;
		
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.price);
		System.out.println(dog.color);
		System.out.println(dog.weight);
		dog.eat();
		
		System.out.println();
		
		Animals cat =new Animals();
		cat.name="leo";
		cat.age=4;
		cat.price=1000;
		cat.color="white";
		cat.weight=5;
		
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(cat.price);
		System.out.println(cat.color);
		System.out.println(cat.weight);
		cat.eat();

	}

}
