package com.inherit.test01;

public class Car {
	//필드
	private String color;
	private int speed;
	
	//메소드
	
	//생성자(기본생성자, 매개변수 생성자)
	//객체 필드 초기화 목적의 일종의 메소드가 생성자
	//모든 생성자는 super();가 생략되어있다.
	public Car () {//기본 생성자
		
		//super(); 가 생략되어있다.
		//부모 클래스인 Object 클래스의 객체부터 생성 후 자식클래스 객체를 생성한다.
		
	}
	
	public Car(String color) {//매개변수 생성자
		
		//super(); 가 생략되어있다.
		this.color = color;
		//필드의 color = 매개변수 color;
		
	}
	
	public Car(String color, int speed) {//매개변수 생성자
		
		//super(); 가 생략되어있다.
		this.color = color;
		//필드의 color = 매개변수 color;
		this.speed = speed;
		//필드의 speed = 매개변수 speed;
		
	}
	
	//getter와 setter 메소드
	//getter는 필드의 값을 가져오는 메소드
	//setter는 필드에 값을 저장하는 메소드
	
	//필드 color의 getter 메소드
	public String getColor() {//public 반환형 get가져올필드명(가져올 필드명의 첫글자는 대문자로)() {리턴}
		
		return color;
		//color라는 이름을 가진 지역변수가 없으므로
		//필드(전역변수)인 color를 가져온다.
	}
	
	//필드 color의 setter 메소드
	public void setColor(String color) {//public 반환형 set가져올필드명(가져올 필드명의 첫글자는 대문자로)(필드와 동일한 자료형의 매개변수) {리턴}
		
		this.color = color;
		//color라는 지역변수가 있으므로
		//this를 이용해 필드 color를 지정해야한다.
		
	}
	
	//필드 speed의 getter 메소드
	public int getSpeed() {
		
		return speed;
		
	}
	
	//필드 speed의 setter 메소드
	public void setSpeed(int speed) {
		
		this.speed = speed;
		
	}
	
	public void accelPedal() {
		
		System.out.println("속도가 올라갑니다.");
		setSpeed(getSpeed()+10);
		//getSpeed메소드는 필드의 speed 값을 가져오는 메소드
		//getSpeed 메소드로 값을 가져와 10을 추가후 setSpeed 메소드로 리턴해준다.
	}
	
	public void breakPedal() {
		
		setSpeed(getSpeed()-10);
		
		if(getSpeed() > 0) {
			System.out.println("속도가 줄어듭니다.");
		}
		
		else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
		
	}
	
	@Override //해당 annotation을 해야 오버라이딩 가능하다.
	public String toString() {
		
		return "현재 속도는 " + speed + "입니다.";
		
	}

}
