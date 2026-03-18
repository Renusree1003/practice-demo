package com.example_project;

public class Application {
	public static void main(String[] args) {
		System.out.println("Git Project");
		System.out.println("Login feature");
	}
	
	
	class SubApplication extends Application{
		 public void features() {
		        System.out.println("Signup feature added");
		 }
	}

}
