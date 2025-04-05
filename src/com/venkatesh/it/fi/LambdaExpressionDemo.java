package com.venkatesh.it.fi;

import java.util.function.Predicate;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// lambda expression
		
		Operation addOpr = (int a, int b)  ->{
										return a+b;
									};
								
		/*Operation subOpr = (int a, int b)  ->{
											return a-b;
										};*/
			
									
			Operation subOpr = (int a, int b)  -> a-b;
									
		   						
									
									
										
										
		Operation divOpr = (int a, int b)  ->{
											return a/b;
										};
									
		// Lambda expression execution
							int res= addOpr.operation(30, 40);
							System.out.println(res);
							
							// for divOpr
							res = divOpr.operation(20, 10);
							System.out.println(res);
									
	  // execution of Information
		System.out.println("*************************************************");					
		Information info = ()  -> {
										System.out.println("this is very important topic");
										};
		
		info.message();
		
		
		System.out.println("******************************************");
		
		System.out.println(subOpr.operation(20, 10));
		
		
							
							

	}

}
