package com.uni;

public class Student extends Human {
	
	//필드 선언
	private String number;
	private String major;
	
	//생성자
	public Student() {}
	public Student(String name, int age, int height, int weight, String number, String major) {
		
		super(name, age, height, weight);
		this.number = number;
		this. major = major;
		
	}
	
	//getter method
	public String getNumber() {
		return number;
	}
	
	public String getMajor() {
		return major;
	}
	
	//setter method
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setMajor(String Major) {
		this.major = major;
	}
	
	//메소드
	public String printInformation() {
		
		return(super.getName() + " " + super.getAge() + " " + super.getHeight() + " " + super.getWeight() + " " + number +  " " + major);
		
	}

}
