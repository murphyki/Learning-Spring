package com.murphyki.learning.spring.examples.LifecycleCallbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(Application.class.getResource("spring.xml").toString());
		context.registerShutdownHook();
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
