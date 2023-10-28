package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	//필드 선언
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		
		this.width = width;
		this.height = height;
	}
	
	//getter method
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	//setter method
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		
		//사각형 면적
		//버림 이용해 소수점 첫째자리까지 출력
		String recArea = String.format("%.1f", (double)(width * height));
		System.out.println("사각형의 면적 : " + recArea);
		
		//반올림 이용해 소수점 첫째자리까지 출력
		System.out.println("사각형의 면적 : " + Math.round((int)(width * height) * 10) / 10.0);
		
		//사각형 둘레
		//버림 이용해 소수점 첫째자리까지 출력
		String recLength = String.format("%.1f", (double)(width  + height)*2.0);
		System.out.println("사각형의 면적 : " + recLength);
		
		//반올림 이용해 소수점 첫째자리까지 출력
		System.out.println("사각형의 면적 : " + Math.round(((int)((width + height)*2) * 10) / 10.0));
	}

}
