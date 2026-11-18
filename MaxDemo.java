package com.Polymorphism;

public class MaxDemo {

	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		MaxDemo m = new MaxDemo();

		System.out.println("Max of 2: " + m.max(10, 20));
		System.out.println("Max of 3: " + m.max(10, 20, 15));
	}

}
