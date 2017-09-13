package com.spring.framework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.configuration.DIConfiguration;
import com.spring.framework.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		//		"applicationContext.xml");
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi User", "abc@xyz.com");
		
		//close the context
		context.close();
	}

}
