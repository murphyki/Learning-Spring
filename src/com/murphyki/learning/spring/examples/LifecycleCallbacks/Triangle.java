package com.murphyki.learning.spring.examples.LifecycleCallbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements InitializingBean, DisposableBean {
	private String type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle() {
		System.out.println("Triangle no-arg constructor called...");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle InitializingBean.afterPropertiesSet lifecycle method called...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle DisposableBean.destroy lifecycle method called...");
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle.draw() is drawing a " + this.type + " triangle!");
		System.out.println("PointA=" + this.pointA);
		System.out.println("PointB=" + this.pointB);
		System.out.println("PointC=" + this.pointC);
	}
}
