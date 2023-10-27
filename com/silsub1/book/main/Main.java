package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Book b1 = new Book("골든타임" , "문학수첩" , 10000);
		Book b2 = new Book("해리포터" , "집영사" , 20000);
		
		//toString() 출력
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		//equals() 로 비교
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b2));
		
		//얕은 복사
		b1 = b2;
		
		//깊은 복사
		//getter 메소드 이용해 객체에 저장한다.
		Book b4  = new Book(b1.getTitle(), b1.getAuthor(), b1.getPrice());
		System.out.println(b1.equals(b4));
		System.out.println(b1.hashCode() == b4.hashCode());
		
		//주소 값이 동일한가?
		if(b1 == b2) System.out.println(true);
		else System.out.println(false);
		
		if(b1.equals(b2)) System.out.println(true);
		else System.out.println(false);
		

	}

}
