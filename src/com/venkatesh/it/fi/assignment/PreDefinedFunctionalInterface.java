package com.venkatesh.it.fi.assignment;

import java.util.function.Predicate;

public class PreDefinedFunctionalInterface {

	public static void main(String[] args) {
				//Predicate
		
				// boolean test
		String value = "Venkatesh";
		Predicate<String> verifier = (String v)  -> {
															return value.equalsIgnoreCase(v);
		};
			
		
									boolean isSame = verifier.test("Suresh");
									System.out.println(isSame);
		Predicate<Integer> verification2 = t  -> t >0;
		System.out.println(verification2.test(20));
		System.out.println(verification2.test(-50));
		
		
		// Age>21
		
		Predicate<Integer> ageCheck = (Integer val)  -> {
																return val>21;
		};
		
		// by using predicate
		
		if(ageCheck.test(34)) {
			System.out.println("eligible");
		}else {
			System.out.println("not eligible");
		}
	}

}
