package com.edu.tju;

public class Triangle {
	private double side1,side2,side3;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public String getShape() {
		String sha[]= {"equilateral","isosceles", "scalene"};
		int i=-1;
		if(this.side1!=this.side2&&this.side1!=this.side3&&this.side2!=this.side3) {
			i=2;
		}else if(this.side1==this.side2&&this.side2==this.side3) {
			i=0;
		}else {
			i=1;
		}		
		return sha[i];
	}

	
	public double getArea() {
		double p=(this.side1+this.side2+this.side3)/2;
		double s=Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
		return s;
	}
	
	public double getPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
}
