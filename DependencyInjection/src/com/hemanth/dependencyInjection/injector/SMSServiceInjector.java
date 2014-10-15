package com.hemanth.dependencyInjection.injector;

import com.hemanth.dependencyInjection.consumer.Consumer;
import com.hemanth.dependencyInjection.consumer.MyDIApplication;
import com.hemanth.dependencyInjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new SMSServiceImpl());
	}

}
