package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;

import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Circle [] cArr = new Circle [3];
		Rectangle [] rArr = new Rectangle [3];
		
		cArr[0] = new Circle (10, 10, 5);
		cArr[1] = new Circle (20, 20, 10);
		cArr[2] = new Circle (30, 30, 20);
		
		rArr[0] = new Rectangle(10,10,10,30);
		rArr[1] = new Rectangle(20,20,20,40);
		rArr[2] = new Rectangle(30,5,50,20);
		
		for(int i = 0; i < 3; i++) {
			cArr[i].draw();
			rArr[i].draw();
		}

	}

}
