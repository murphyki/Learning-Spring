package com.murphyki.learning.spring.examples.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.murphyki.learning.spring.examples.Triangle;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/murphyki/learning/spring/examples/simple/spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
