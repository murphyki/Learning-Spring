package com.murphyki.learning.spring.examples.LifecycleCallbacks;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point no-arg constructor called...");
	}
	
	public void init() {
		System.out.println("Point init lifecycle method called...");
	}
	
	public void cleanUp() {
		System.out.println("Point cleanUp lifecycle method called...");
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
