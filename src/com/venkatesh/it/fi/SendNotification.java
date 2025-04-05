package com.venkatesh.it.fi;

public class SendNotification {

	public static void main(String[] args) {
			/* Notification email = ()  ->{
				
				System.out.println("sending email communication to user");
				return "Email communication";
			};*/
			Notification mobile = ()  -> {
				return "mobile Notification";
			};
			
			Notification email = ()  ->"Email communication";
			
			System.out.println(mobile.notificationType());
			

	}

}
