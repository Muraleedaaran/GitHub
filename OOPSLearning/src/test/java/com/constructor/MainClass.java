package com.constructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	static Map<String, Employee> empMap = new HashMap<String, Employee>();

	public static void main(String[] args) {

		// Create employee class
		// Address new class
		// Send employee and address details.
		// print all emp details
		// empid-print one employee detail

		Address address1 = new Address("Trichy", "TN");
		Address address2 = new Address("Chennai", "TN");

		Employee e1 = new Employee("Sriram", "20092010", address1);
		Employee e2 = new Employee("Jayashree", "317309", address2);
		Employee e3 = new Employee("Muralee", "422472", address1);

		empMap.put(e1.eId, e1);
		empMap.put(e2.eId, e2);
		empMap.put(e3.eId, e3);

		e1.printEmpDetails();
		System.out.println();
		e2.printEmpDetails();
		System.out.println();
		MainClass.printEmployeeData("422472");
	}

	static void printEmployeeData(String id) {
		System.out.println("Emp details are >>> ");
		System.out.println("Name >>> " + empMap.get(id).empName);
		System.out.println("City >>> " + empMap.get(id).address.city);
		System.out.println("State >>> " + empMap.get(id).address.state);
	}
}
