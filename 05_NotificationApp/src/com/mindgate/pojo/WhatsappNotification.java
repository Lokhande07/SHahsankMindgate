package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsappNotification implements Notification {

	@Override
	public void sendNotification(String to, String message) {
		System.out.println("Sending Whatsapp Notification");
		System.out.println("To ::" + to);
		System.out.println("Message ::" + message);
	}

}
