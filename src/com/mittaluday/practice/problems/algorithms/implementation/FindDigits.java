package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		
		for(int testCase = 0; testCase < numTestCases; testCase++){
			
			int number = in.nextInt();
			String numberStr = String.valueOf(number);
			int totalDigits = 0;
			
			for(int i = 0; i< numberStr.length(); i++){
				int currentDigit = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
				if(currentDigit != 0){
					if(number % currentDigit == 0){
						totalDigits += 1;
					}
				}
			}
			System.out.println(totalDigits);
		}
		in.close();
		
	}
}
