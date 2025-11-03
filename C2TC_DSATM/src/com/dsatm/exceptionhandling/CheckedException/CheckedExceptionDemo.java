package com.dsatm.exceptionhandling.CheckedException;

import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			String str=CheckedException.acceptText();
			System.out.println("The string is: "+str);
		} catch (IOException e) {
			System.err.println("An error occurred while reading input: "+e.getMessage());
		}
	}

}
