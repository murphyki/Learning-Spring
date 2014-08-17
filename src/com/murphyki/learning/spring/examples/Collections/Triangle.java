package com.murphyki.learning.spring.examples.Collections;

import java.util.List;

public class Triangle {
	private String type;
	private List<Point> points;
	
	public Triangle() {
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("setType called...");
		this.type = type;
	}
	
	public void draw() {
		System.out.println("Triangle.draw() is drawing a " + this.type + " triangle!");
		for (Point point : this.points) {
			System.out.println("Point=" + point);
		}
	}
}
