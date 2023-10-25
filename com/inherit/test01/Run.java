package com.inherit.test01;

public class Run {

	public static void main(String[] args) {
		
		//스포츠카 생성
		Sports c1 = new Sports("노란");
		System.out.print(c1.getColor());
		System.out.println(c1.toString());
		
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1.toString());
		
		c1.breakPedal();
		c1.breakPedal();
		System.out.println(c1.toString());
		
		
		Car c2 = new SUV("검정", "현대");
		c2.accelPedal();
		System.out.println(c2);

	}

}
