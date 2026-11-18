package com.Polymorphism;

public class CalculateArea {
	public double Area(double r) {
		return 3.14 * r * r;
	}

	public double Area(double l, double b) {
		return l * b;
	}

	public static void main(String[] args) {
		CalculateArea a = new CalculateArea();
		System.out.println("Area of circle is : " + a.Area(3));
		System.out.println("Area of rectangle is : " + a.Area(4, 3));

	}

}
