package com.Polymorphism;

public class Multiply {
	public int mul(int a, int b) {
		return a * b;
	}

	public double mul(double a, double b) {
		return a * b;

	}

	public static void main(String[] args) {
		Multiply m = new Multiply();
		System.out.println("Multiplication of two numbers : " + m.mul(4, 3));
		System.out.println("Multiplication of three numbers : " + m.mul(2.3, 4.5));

	}

}
