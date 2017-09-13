package com.spring.framework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.framework.services.EmailService;
import com.spring.framework.services.MessageService;

@Configuration
@ComponentScan(value={"com.spring.framework.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
