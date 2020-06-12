package org.springAop.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int message() {
		System.out.println("message methd run");
		return 10;
	}
}
