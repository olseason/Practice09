package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {

	
	//필드
	private double width;
	private double height;
	
	//생성자 
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	
	//메소드 gs
	
	//메소드 일반
	public void resize(double input) {
		this.width = this.width * input;
		this.height = this.height * input;
		
	}

	@Override
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (this.width+this.height)*2;
		return perimeter;
	}
	
	
}
