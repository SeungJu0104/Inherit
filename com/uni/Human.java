package com.uni;

public class Human {
	//필드 선언
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	//생성자
	public Human () {}
	public Human (String name, int age, int height, int weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	//getter method
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	//getter method
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//메소드
	public String printInformation() {
		
		return (name + " " + age + " " + height + " " + weight);
		
	}

}
