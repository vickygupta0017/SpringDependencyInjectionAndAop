package com.spring.framework.services;

import org.springframework.stereotype.Component;


@Component
public class TwitterService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
		return true;
	}

	public MessageService factoryMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
