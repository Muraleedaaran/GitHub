package com.general;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number for which you want to find sum");
		int n = scn.nextInt();
		int result = 0;
		
		
		// For loop
		
		
		/*
		 * for (int i = 1; i <= n; i++) { result = i + result; }
		 */
		
		//do while loop
		
		int i = 1;
		do
		{
			result = result + i;
			i++;
		}while(i<=n);
		
		
		//while loop
		
//		int i = 1;
//		while(i<=n)
//		{
//			result = result + i;
//			i++;
//		}
		
		System.out.println("Result is >>> " + result);
	}

}
