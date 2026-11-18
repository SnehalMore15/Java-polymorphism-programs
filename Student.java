package com.Polymorphism;

import java.util.Stack;

public class Student {
	int id;
	String name;

	public Student() {
		id = 0;
		name = "unknown";
	}

	public Student(int id) {
		this.id = id;
		name = "unknown";
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	String display() {
		return "id: " + id + " ,name : " + name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(110);
		Student s3 = new Student(111, "Snehal");
		System.out.println(s1.display());
		System.out.println(s2.display());
		System.out.println(s3.display());
	}
}
