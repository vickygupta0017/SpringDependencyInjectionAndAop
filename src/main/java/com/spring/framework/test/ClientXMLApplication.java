package com.spring.framework.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.consumer.MyXMLApplication;



public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyXMLApplication app = (MyXMLApplication)context.getBean(MyXMLApplication.class);
        System.out.println("******1**********");
		app.processMessage("Hi gaurav", "gaurav@abc.com");
		System.out.println("*****2**** ****");
		app.processSecondMessage("gaurav");
		System.out.println("*****3**** ****");
		app.processThirdMessage("vicky");
		System.out.println("*****End**** ****");
		// close the context
		context.close();
	}

}
