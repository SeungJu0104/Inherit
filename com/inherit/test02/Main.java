package com.inherit.test02;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("이것이 자바다", "멀티", 100);
		Book b2 = new Book("이것이 자바다", "캠퍼스", 300);
		
		//두 객체의 정보 출력 처리 : toString();
//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
		
		
		//Object의 toString은 풀패키지명과 객체의 해시코드를 16진수 등으로 변환해 리턴해주는 메소드이다.
		//.toString()은 객체 호출시 자동으로 뒤에 JVM에 의해 생성.
		//그래서 아래 출력문을 실행하면 위의 toString메소드를 사용한 출력문과 동일한 값이 출력된다.
		//따라서, 객체의 값 확인을 위해 오버라이딩해서 많이 사용한다.
		System.out.println(b1);
		System.out.println(b2);
		
		//객체는 equals 메소드를 이용해 비교해야한다.
		System.out.println("b1과 b2는 같은 객체인가? : " + b1.equals(b2));
		
		//얕은 복사
		Book b3 = b1;
		//b1이 갖고 있는 객체의 주소값을 b3에 복사한다.
		System.out.println("b1 == b3 ? " + b1.equals(b3));
		//같은 주소값을 갖고 있기 때문에 true가 출력된다.
		
		Book b4 = new Book("이것이 자바다", "멀티", 100);
		//객체의 내용만 동일하고, b1과는 이름만 동일한 다른 객체이다.
		//b1과 b4가 갖고 있는 주소값 또한 다르고, 실제 주소도 다르다.
		System.out.println("b1 == b4 ? " + b1.equals(b4));
		//해시코드는 다르지만 b1과 b4의 객체에는 같은 값을 담고 있기 때문에
		//같은 객체로 판단하게하기 위해서는 equals 메소드를 오버라이딩해야한다.
		
		//Book 클래스에서 equals 메소드를 오버라이딩을 했고, 객체 값들을 비교해서 참 거짓을 리턴 준다.
		//위에 쓴 주석들과 결과값이 다르게 나타날 수 있다.(오버라이딩 했기 때문이다.)
		
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
	}

}
