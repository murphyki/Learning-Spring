package com.murphyki.learning.spring.examples.BeanFactoryPostProcessor;

public class Point {
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
}
