package com.venkatesh.it.fi.assignment;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
			// Req: Take values as alist and convert to uppercase then print all those values
		
		List<String> names = List.of("venkatesh","suresh","naresh");
		
		Consumer<String> convertAndPrint = (String v)  -> {
			
			System.out.println(v.toUpperCase());			
		};
		
		convertAndPrint.accept("Java Lang");
		
		names.forEach(convertAndPrint);

	}

}
