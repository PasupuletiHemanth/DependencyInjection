package com.hemanth.dependencyInjection.injector;

import com.hemanth.dependencyInjection.consumer.Consumer;

public interface MessageServiceInjector {
	public Consumer getConsumer();
}
