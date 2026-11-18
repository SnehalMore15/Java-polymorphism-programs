package com.Polymorphism;

public class Cal {
	public int calculate(int n) {
		return n * n;
	}

	public double calculate(double n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		Cal c = new Cal();

		System.out.println("Square: " + c.calculate(5));
		System.out.println("Cube: " + c.calculate(5.0));
	}
}
