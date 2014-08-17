package com.murphyki.learning.spring.examples.BeanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(Application.class.getPackage().getName().replace(".", "/") + "/spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
