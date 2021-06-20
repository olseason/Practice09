package com.javaex.ex04;

public class RectTriangle extends Shape{

	//필드 
	private double width;
	private double height;
	
	
	//생성자
	public RectTriangle() {
		
	}
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	//메소드 gs
	

	
	//메소드 일반 
	@Override
	public double getArea() {
		double area = (this.width * this.height)/2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = this.width + this.height + Math.sqrt(this.width*this.width+this.height*this.height);
		return perimeter;
	}
	
	
	
}
