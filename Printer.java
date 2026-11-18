package com.Polymorphism;

public class Printer {
	static String print(String msg) {
		return "One value: " + msg;
	}

	static String print(String msg1, String msg2) {
		return "Two values: " + msg1 + " " + msg2;
	}

	public static void main(String[] args) {
		System.out.println(Printer.print("Hello"));
		System.out.println(Printer.print("Hello", "Snehal"));
	}
}
