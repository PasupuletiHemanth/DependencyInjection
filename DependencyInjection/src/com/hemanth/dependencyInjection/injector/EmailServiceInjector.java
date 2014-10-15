package com.hemanth.dependencyInjection.injector;

import com.hemanth.dependencyInjection.consumer.Consumer;
import com.hemanth.dependencyInjection.consumer.MyDIApplication;
import com.hemanth.dependencyInjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector  {

	 @Override
	    public Consumer getConsumer() {
	        return new MyDIApplication(new EmailServiceImpl());
	    }
}
