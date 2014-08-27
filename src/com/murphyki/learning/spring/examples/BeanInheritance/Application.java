package com.murphyki.learning.spring.examples.BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(Application.class.getResource("spring.xml").toString());
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
