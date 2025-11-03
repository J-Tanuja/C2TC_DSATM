package com.dsatm.Generics;

public class GenericClass<E> 
{
	E data;

	public E getData() {
		return data;
	}

	public void setData(E i) {
		this.data = i;
	}
	public String toString() {
		return "GenericClass [data="+data+"]";
	}

}
