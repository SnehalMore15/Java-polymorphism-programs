package com.Polymorphism;

public class Shopping {
	public void purchase(int productId) {

		System.out.println("Product ID: " + productId);
	}

	public void purchase(int productId, int quantity) {
		System.out.println("Product ID: " + productId);
		System.out.println("Quantity: " + quantity);
	}

	public void purchase(int productId, int quantity, double discount) {
		System.out.println("Product ID: " + productId);
		System.out.println("Quantity: " + quantity);
		System.out.println("Discount: " + discount + "%");
	}

	public void purchase(String productName, int quantity) {
		System.out.println("Product Name: " + productName);
		System.out.println("Quantity: " + quantity);
	}

	public static void main(String[] args) {
		Shopping s = new Shopping();

		s.purchase(101);
		s.purchase(101, 2);
		s.purchase(101, 2, 10);
		s.purchase("Laptop", 1);
	}
}
