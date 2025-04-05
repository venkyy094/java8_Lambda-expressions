package com.venkatesh.it.fi.assignment;


public class Application {
	
	public static void main(String[] args) {
		
		Application app = new Application();
		boolean result = app.checkStringValuesequalOrNot("java", "python");
		System.out.println(result);
		
	}
	
	public boolean checkStringValuesequalOrNot(String v1, String v2) {
		
				StringValuesVerification verification = (String value1, String value2)  -> {
					return value1.equalsIgnoreCase(value2);
				};
				
				boolean result = verification.validateStringVerification(v1, v2);			
				return result;
				
				
				
	}
	
				
				

}
