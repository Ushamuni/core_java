package com.xworkz.constructor;

public class RegisterApp {

	public static void main(String[] args) {
		
		Registration usha = new Registration ("Usha", 9145);
		System.out.println(usha.phone);
		Registration kusuma = new Registration ("Usha", "usha45@gmail.com");
		System.out.println(usha.mail);
	}

}
