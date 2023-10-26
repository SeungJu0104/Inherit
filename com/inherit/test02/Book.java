package com.inherit.test02;

public class Book {
	//모든 클래스의 부모클래스는 object 클래스
	
	//필드
	private String title;
	private String writer;
	private int price;
	
	//생성자
	public Book () {}
	
	public Book (String title, String writer, int price) {
		
		this.title = title;
		this.writer = writer;
		this.price = price;
		
	}
	
	//getter와 setter 메소드 작성하기.
	//각 필드별로 만들기.
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	//---------------------------------------------------------------------------------------
	//toString 메소드 오버라이딩
	//Object의 toString은 풀패키지명과 객체의 해시코드를 16진수 등으로 변환해 리턴해주는 메소드이다.
	@Override
	public String toString() {
		
		return title + ", " + writer + ", " + price;
		
	}
	
	

	//------------------------------------------------------------------------------------------
	//equals 메소드 오버라이딩
	//오버라이드할 때는 반드시 @Override 를 붙여줘야한다.
	//Object의 equals는 두 객체의 주소값을 비교해 같으면 true, 다르면 false를 리턴하는 메소드
	//객체 내에 갖고 있는 내용이 동일한지 비교하는 메소드로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은 객체
		if(this == obj) {//여기서 this는 Main을 기준으로는 b1이다. obj는 b4.
			
			return true;
			
		}
		//전달받은 객체(obj)가 null인 경우 무조건 다른 객체
		if(this == null) {
			
			return false;
			
		}
		
		//각 필드별로 비교를 시작한다.
		//------------------------------------------------------
		//부모클래스 타입의 변수에는 자식클래스의 객체가 저장된다.(다형성)
		//Book 타입의 객체가 들어있는 Object 타입의 obj 매개변수를 형변환을 통해 Book으로 변경
		Book other = (Book)obj;
		
		//원본 객체의 제목이 null이면 비교할 객체의 제목도 null이어야 필드가 같은 것.
		if(this.title == null) {
			if(other.title != null) {
				return false;
			}
		}
		
		else if(!title.equals(other.title)) {//두 객체의 title이 서로 다른 경우 return false;
		//여기서 쓰는 equals 메소드는 String 클래스의 메소드
			return false;
		}
		
		//title을 비교한 것과 동일한 방식으로 writer를 비교.
		if(this.writer == null) {
			if(other.writer != null) {
				return false;
			}
		}
		
		else if(!writer.equals(other.writer)) {
		//여기서 쓰는 equals 메소드는 String 클래스의 메소드
			return false;
		}
		
		//price 비교
		if(price != other.price) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public int hashCode() {
		//동일한필드값들은 같은 해시코드를 가진다.
		//이걸 이용해 해시코드를 오버라이딩해 동일성을 확보한다.
		return (title + writer + price).hashCode();
		
	}
	
	
	
	

}
