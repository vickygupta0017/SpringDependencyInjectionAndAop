package com.spring.framework.consumer;

import com.spring.framework.services.MessageService;

public class MyXMLApplication {

	private MessageService service;

	//constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}
	
	//setter-based dependency injection
	public void setService(MessageService svc){
		System.out.println("service dependency injected by setter");
		this.service=svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
	
	public void processSecondMessage(String msg){
		System.out.println("Hi "+msg+" Second one running"); 
	}
	
	public void processThirdMessage(String msg){
		System.out.println("Hi "+msg+" Third one running"); 
	}
}
