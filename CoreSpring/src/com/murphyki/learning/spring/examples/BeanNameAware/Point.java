package com.murphyki.learning.spring.examples.BeanNameAware;

import org.springframework.beans.factory.BeanNameAware;

public class Point implements BeanNameAware {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		System.out.println("setX() called: " + x);
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		System.out.println("setY() called: " + y);
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Point.setBeanName() called...");
		System.out.println("name=" + name);
	}
}
