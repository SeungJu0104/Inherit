package com.inherit.test01;

public class SUV extends Car {
	
	private String brand;
	
	public SUV() {
		
		System.out.println("suv 생성");
		
	}
	
	public SUV(String color) {
		
		super(color);
		
		System.out.println(color + "색 suv 생성");
		
	}
	
	public SUV(String color, String brand) {
		
		super(color);
		this.brand = brand;
		
		System.out.println(color + "색 " + brand + " suv 생성");
		
	}
	
	@Override
	public void accelPedal() {
		
		System.out.println("속도가 적당히 올라갑니다.");
		super.setSpeed(super.getSpeed() + 5);
		//super. 굳이 붙이지 않아도 실행된다.
		//헷갈리는걸 방지하기위해 종종 사용한다.
		
	}
	
	@Override
	public void breakPedal() {
		
		super.setSpeed(super.getSpeed() - 5);
		
		if(super.getSpeed() > 0) {
			
			System.out.println("속도가 적당히 줄어듭니다.");
			
		}
		
		else {
			
			System.out.println("멈췄습니다.");
			super.setSpeed(0);
			
		}
		
	}
	
	@Override
	public String toString() {
		
		return brand + " suv의 현재 속도는 " + super.getSpeed() + " 입니다.";
		
	}
	
}
