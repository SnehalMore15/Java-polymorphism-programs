package com.Polymorphism;

public class Demo {
	public String show(int id, String name) {
		return " id : " + id + " name : " + name;
	}

	public String show(String name, int id) {
		return " name : " + name + " id : " + id;

	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.show(1, "Snehal"));
		System.out.println(d.show("Snehal", 1));
	}

}
