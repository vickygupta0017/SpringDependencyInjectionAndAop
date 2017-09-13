package com.spring.framework.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.framework.services.EmailService;
import com.spring.framework.services.MessageService;

@Component
public class MyApplication {

	//field-based dependency injection
	//@Autowired
	private MessageService service;
	
//	constructor-based dependency injection	
//	@Autowired
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}
	
	@Bean
	public MessageService getEmailService(){
		return service.factoryMethod();
	}
	
	@Autowired
	public void setService(MessageService svc){
		System.out.println("injected message service through setter injection");
		this.service=svc;
	}
	
	public boolean processMessage(String msg, String rec){
		return this.service.sendMessage(msg, rec);
	}
}
