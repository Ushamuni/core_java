package com.xworkz.oops;

public class CellosignaturePen {

	public static void main(String[] args) {
		Pen Cellopen =new Pen();
		 Cellopen.brand="Cello";
		 Cellopen.price=200;
		 Cellopen.color="blue";
		 Cellopen.model="pen";
		 
		 System.out.println(Cellopen.brand);
		 System.out.println(Cellopen.price);
		 System.out.println(Cellopen.color);
		 System.out.println(Cellopen.model);
		 Cellopen.write();
		 
		 System.out.println("");
		 
		 Pen Cellopen_1 =new Pen();
		 Cellopen_1.brand="Inkpen";
		 Cellopen_1.price=100;
		 Cellopen_1.color="black";
		 Cellopen_1.model="pen";
		 
		 System.out.println(Cellopen_1.brand);
		 System.out.println(Cellopen_1.price);
		 System.out.println(Cellopen_1.color);
		 System.out.println(Cellopen_1.model);
		 Cellopen_1.write();
		 
		 

	}

}
