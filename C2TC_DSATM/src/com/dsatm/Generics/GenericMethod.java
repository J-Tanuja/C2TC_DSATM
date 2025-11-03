package com.dsatm.Generics;

public class GenericMethod 
{
	public <E> void displayArrayElements(E[] elements) {
		for(E i:elements)
			System.out.println("The elements are: "+i);
	}

}
