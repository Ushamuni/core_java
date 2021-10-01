package com.xworkz.constructor;

public class Registration {
	String name;
	int phone;
	String mail;
	
	public Registration(String name, int phone) {
		System.out.println("Registration successfull using phone");
		}
	public Registration(String name, String mail) {
		System.out.println("Registration successfull using mail");
		}


}
