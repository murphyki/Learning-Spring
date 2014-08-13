package com.murphyki.learning.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("example1.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
