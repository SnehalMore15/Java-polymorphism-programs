package com.Polymorphism;

public class Login {

	String login(String username) {
		return "Login with username: " + username;
	}

	String login(String username, String password) {
		return "Login with username: " + username + ", Password: " + password;
	}

	public static void main(String[] args) {
		Login l = new Login();

		System.out.println(l.login("snehal_more"));
		System.out.println(l.login("snehal_more", "12345"));
	}
}
