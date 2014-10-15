package com.hemanth.dependencyInjection.test;

import com.hemanth.dependencyInjection.consumer.Consumer;
import com.hemanth.dependencyInjection.injector.EmailServiceInjector;
import com.hemanth.dependencyInjection.injector.MessageServiceInjector;
import com.hemanth.dependencyInjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String msg = "Hi Hemanth";
	        String email = "01hemanth@gmail.com";
	        String phone = "9454567980";
	        MessageServiceInjector injector = null;
	        
	        Consumer app = null;
	         
	        //Send email
	        injector = new EmailServiceInjector();
	        app = injector.getConsumer();
	        app.processMessages(msg, email);
	         
	        //Send SMS
	        injector = new SMSServiceInjector();
	        app = injector.getConsumer();
	        app.processMessages(msg, phone);
	}

}
