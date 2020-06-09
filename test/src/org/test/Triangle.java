package org.test;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class Triangle implements Shape,InitializingBean,DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
	
		System.out.println(pointA.getX()+" "+pointA.getY()+" "+ " Triangle drawn!!!!!!!!");
		System.out.println(pointB.getX()+" "+pointB.getY()+" "+ " Triangle drawn!!!!!!!!");
		System.out.println(pointC.getX()+" "+pointC.getY()+" "+ " Triangle drawn!!!!!!!!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//draw();
		System.out.println("Bean initialization is doen at the time we run the application . This is from Trianglebean");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("triangle destroyd");
	}

	


	

}
