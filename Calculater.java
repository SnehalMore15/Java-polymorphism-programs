package com.Polymorphism;

public class Calculater {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Calculater c = new Calculater();
		System.out.println("The Addtion of two integers : " + c.add(23, 11));
		System.out.println("The Addtion of three integers : " + c.add(4, 5, 6));

	}

}
