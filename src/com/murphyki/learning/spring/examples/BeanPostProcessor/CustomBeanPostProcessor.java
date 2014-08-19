package com.murphyki.learning.spring.examples.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("CustomBeanPostProcessor.postProcessAfterInitialization()");
		System.out.println("bean: " + bean.toString());
		System.out.println("arg1: " + arg1);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("CustomBeanPostProcessor.postProcessBeforeInitialization()");
		System.out.println("bean: " + bean.toString());
		System.out.println("arg1: " + arg1);
		return bean;
	}

}
