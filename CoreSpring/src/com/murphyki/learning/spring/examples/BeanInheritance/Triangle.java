package com.murphyki.learning.spring.examples.BeanInheritance;

public class Triangle {
	private String type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("setType() called: " + type);
		this.type = type;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		System.out.println("setPointA() called: " + pointA);
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		System.out.println("setPointB() called: " + pointB);
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		System.out.println("setPointC() called: " + pointC);
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle.draw() is drawing a " + this.type + " triangle!");
		System.out.println("PointA=" + this.pointA);
		System.out.println("PointB=" + this.pointB);
		System.out.println("PointC=" + this.pointC);
	}
}
