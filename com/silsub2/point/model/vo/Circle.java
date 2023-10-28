package com.silsub2.point.model.vo;

public class Circle extends Point {
	
	//필드 선언
	private int radius;
	
	//생성자
	public Circle () {}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
		//center point로 처리?
	}
	
	//원의 x, y좌표 및 면적과 둘레 계산 출력.
	@Override
	public void draw() {
		
		super.draw();
		
		//원면적
		//버림 이용해 소수점 첫째자리까지 출력
		//String circleArea = String.format(".1f", Math.PI*radius*radius);
		double circleArea = (int)((radius * radius * Math.PI)*10) / 10.0;
		System.out.println("원의 면적 : " + circleArea);
		
		//반올림해 소수점 첫째자리까지 출력
		System.out.println("원의 면적 : " + Math.round((radius * radius * Math.PI) * 10) / 10.0);
		
		//원둘레
		//버림 이용해 소수점 첫째자리까지 출력
		String circleLength = String.format("%.1f", 2*Math.PI*radius);
		System.out.println("원의 둘레 : " + (int)((2 * radius * Math.PI) * 10) / 10.0);
		System.out.println("원의 둘레 : " + circleLength);
		
		//반올림해 소수점 첫째자리까지 출력
		System.out.println("원의 둘레 : " + Math.round((2 * radius * Math.PI) * 10) / 10.0);
	}

}
