package com.spring.framework.services;


public class EmailService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email Sent to "+rec+ " with Message="+msg);
		return true;
	}

	public MessageService factoryMethod() {
		return new EmailService();
	}

}
