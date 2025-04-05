package com.venkatesh.it.fi;

@FunctionalInterface
public interface Operation {
	
		int operation(int a, int b);
		
		//int sub(int x, int y);    // functional interface is not allowed to create a another abstract method
		default void m1() {
			System.out.println("m1");
		}
		
		default void m2() {
			System.out.println("m2");
		}
		
		default void m3() {
			System.out.println("m3");
		}
		
		static void m4() {
			System.out.println("m4");
		}
		
		static void m5() {
			System.out.println("m5");
		}
		
		static void m6() {
			System.out.println("m6");
		}
		

}
