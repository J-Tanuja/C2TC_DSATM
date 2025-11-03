package com.dsatm.Generics;

public class GenericConstructorsDemo {
	public static void main(String[]args) {
		System.out.println("Number to Double Conversion: ");
		GenericConstructors obj = new GenericConstructors(10);
		obj.show();
		GenericConstructors obj1 = new GenericConstructors(13.8F);
		obj1.show();
	}

}
