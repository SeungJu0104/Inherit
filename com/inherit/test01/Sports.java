package com.inherit.test01;

public class Sports extends Car {
	
	//기본생성자
	public Sports () {
		
		super();
		//JVM에서 자동으로 동작시킨다.
		//부모 클래스의 기본생성자는 무조건 동작한다.
		System.out.println("sportscar 생성");
		
	}
	
	//매개변수 생성자
	public Sports (String color) {
		
		//super();
		//부모클래스의 매개변수 생성자 호출해 초기화
		//public Car (String color) {this.color = color;} 생성자가 이용된다.
		//부모클래스 객체가 먼저 생성되고, 자식 클래스 객체가 생성된다.
		super(color);
		System.out.println(color + "색 sportscar 생성");
		
	}

}
