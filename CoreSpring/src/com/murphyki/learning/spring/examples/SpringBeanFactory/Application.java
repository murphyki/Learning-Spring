package com.murphyki.learning.spring.examples.SpringBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(Application.class.getResource("spring.xml").getPath()));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
	}
}
