package com.Polymorphism;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("Original main");
		System.out.println(main(10));
		System.out.println(main("Snehal"));
	}

	public static String main(int a) {
		return "Overloaded main int: " + a;
	}

	public static String main(String s) {
		return "Overloaded main String: " + s;
	}
}
