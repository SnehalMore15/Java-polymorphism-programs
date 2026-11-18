package com.Polymorphism;

public class SumDemo {
	public int sum(int a, int b) {
		return a + b;

	}

	public float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		SumDemo s = new SumDemo();
		System.out.println("Sum of two integer values : " + s.sum(4, 5));
		System.out.println("Sum of two float values : " + s.sum(3.44f, 4.3f));

	}

}
