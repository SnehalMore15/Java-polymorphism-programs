package com.Polymorphism;

public class Convertor {

	public double convert(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public double convert(double fahrenheit, String type) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		Convertor c = new Convertor();

		System.out.println("C to F: " + c.convert(30));
		System.out.println("F to C: " + c.convert(86, "F"));
	}
}
