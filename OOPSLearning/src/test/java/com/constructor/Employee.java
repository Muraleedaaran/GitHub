package com.constructor;

public class Employee {

	String empName;
	String eId;
	Address address;

	public Employee() {
	}

	Employee(String name, String id, Address addr) {
		empName = name;
		eId = id;
		address = addr;
	}

	void printEmpDetails() {
		System.out.println("Employee name >>> " + empName);
		System.out.println("Employee id >>> " + eId);
		System.out.println("Employee city >>>" + address.city);
		System.out.println("Employee state >>>" + address.state);
	}

}
