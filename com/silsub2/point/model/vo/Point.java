package com.silsub2.point.model.vo;

public class Point {
	//필드 선언
	protected int x;
	protected int y;
	
	//생성자
	public Point () {}
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter method
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//setter method
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("X : " + x + ", " + "Y: " + y);
	}

}
