package com.constructor;

public class DemoConstructor {
	
	public DemoConstructor(){
		System.out.println("Hello");
	}
	
	//Parameterized constructor
	public DemoConstructor(String name){
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		new DemoConstructor();
		new DemoConstructor("Jayashree");
	}

}
