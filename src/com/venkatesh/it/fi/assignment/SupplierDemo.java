package com.venkatesh.it.fi.assignment;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// generate OTP values
		
		Supplier<Integer> generateOtp = ()  -> {
			int otp = (int) (Math.random()*1000000);
			return otp; 
		};
		System.out.println(generateOtp.get());
		
		
		// get current Date and Time
		
		Supplier<LocalDateTime> oneWeekBackDate = ()  -> {
			return LocalDateTime.now().minusDays(39); 
		};
		
		System.out.println(oneWeekBackDate.get());

	}

}
