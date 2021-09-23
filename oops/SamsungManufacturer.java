package com.xworkz.oops;

public class SamsungManufacturer {

	public static void main(String[] args) {
		Mobile samsungA22=new Mobile();
		samsungA22.brand="Samsung";
		samsungA22.imeiNumber=12345;
		samsungA22.internalStorage=64;
		samsungA22.price=22000;
		
		System.out.println(samsungA22.brand);
		System.out.println(samsungA22.imeiNumber);
		System.out.println(samsungA22.internalStorage);
		System.out.println(samsungA22.price);
		samsungA22.call();
		
		Mobile samsungA22_1=new Mobile();
		samsungA22_1.brand="Samsung";
		samsungA22_1.imeiNumber=67890;
		samsungA22_1.internalStorage=128;
		samsungA22_1.price=25000;
		
		System.out.println("");
		System.out.println(samsungA22_1.brand);
		System.out.println(samsungA22_1.imeiNumber);
		System.out.println(samsungA22_1.internalStorage);
		System.out.println(samsungA22_1.price);
		samsungA22_1.call();
	}

}
