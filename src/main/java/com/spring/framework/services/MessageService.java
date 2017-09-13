package com.spring.framework.services;



public interface MessageService {

	boolean sendMessage(String msg, String rec);
	
	public MessageService factoryMethod();
}
