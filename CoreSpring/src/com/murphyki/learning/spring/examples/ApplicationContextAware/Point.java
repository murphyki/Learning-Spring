package com.murphyki.learning.spring.examples.ApplicationContextAware;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point no-arg constructor called...");
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
