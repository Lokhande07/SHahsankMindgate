package com.mindgate.factory;

import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.pojo.WhatsappNotification;
import com.mindgate.service.Notification;

public class NotificationFactory {
	public static Notification getNotification(int choice) {
		Notification notification = null;
		switch (choice) {
		case 1:
			notification = new SMSNotification();
			break;
		case 2:
			notification = new EmailNotification();
			break;
		case 3:
			notification = new WhatsappNotification();
			break;

		}
		return notification;
	}

}
