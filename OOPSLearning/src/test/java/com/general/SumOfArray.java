package com.general;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arrCount = scn.nextInt();
		
		
		int[] arrayNumber = new int[arrCount];
		
		for (int j=0; j<arrCount; j++) {
			arrayNumber[j] = scn.nextInt();
		}
		
		int sum = 0;
		int i=0;
		while(i<arrayNumber.length) {
			
			if (arrayNumber[i]==6) {
				i++;
				continue;
			}
			sum += arrayNumber[i];
			i++;
		}
		System.out.println("Result is --- " +sum);
	}

}
