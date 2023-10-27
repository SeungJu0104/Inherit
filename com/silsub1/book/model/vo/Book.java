package com.silsub1.book.model.vo;

public class Book {
	
	//필드 선언
	private String title;
	private String author;
	private int price;
	
	//생성자
	public Book () {}
	public Book (String title, String author, int price) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	//getter 메소드
	public String getTitle() {
		
		return title;
		
	}
	
	public String getAuthor() {
		
		return author;
		
	}
	
	public int getPrice() {
		
		return price;
		
	}
	
	//setter 메소드
	public void setTitle(String title) {
		
		this.title = title;
		
	}
	
	public void setAuthor(String author) {
		
		this.author = author;
		
	}
	
	public void setPrice(int price) {
		
		this.price = price;
		
	}
	
	//Object 클래스의 toString 메소드를 오버라이딩
	//Objcet 클래스는 모든 클래스의 부모 클래스
	@Override
	public String toString() {
		
		return title + author + price;
		
	}
	
	//두 객체의 필드 값이 일치하는지를 물어보고,
	//일치하면 true, 불일치하면 false를 반환한다.
	@Override
	public boolean equals(Object obj) {
		
		Book a = (Book)obj;
		
		if(this == obj) {
			return true;
		}
		
		else if(this == null) {
			return false;
		}
		
		
		if((this.title).equals(a.title)) {
			if((this.author).equals(a.author)) {
				if((this.price) == (a.price)) {
					return true;
				}
				else return false;
			}
			else return false;
		}
		else return false;
		
	}
	
	@Override
	public int hashCode() {
		
		return (this.title + this.author + this.price).hashCode();
		
	}
	
}
