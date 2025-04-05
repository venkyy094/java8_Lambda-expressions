package com.venkatesh.it.fi;

public class Calculator implements Operation{

	@Override
	public int operation(int a, int b) {
		System.out.println("addition result is:");
		
		return a+b;
	}
	

}
