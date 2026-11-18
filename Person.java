package com.Polymorphism;

public class Person {

	String details(String name) {
		return "Name: " + name;
	}

	String details(String name, int age) {
		return "Name: " + name + ", Age: " + age;
	}

	public static void main(String[] args) {
		Person p = new Person();

		System.out.println(p.details("Snehal"));
		System.out.println(p.details("Snehal", 20));
	}
}
