package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheBeast {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		
		for(int testCaseId=0; testCaseId < numTestCases; testCaseId++){
			int numberOfDigits = in.nextInt();
			String bdn = "";
			
			/* number of times 3 can appear is either 0 or 5 */
			/* sum of digits of number of times 5 can appear should be divisible by 3 */
			/* try to accumulate as many 5s in greater positions */
			
			/* check if all 5s can appear? */			
			if(numberOfDigits % 3 == 0){
				//Generate a number with all 5s
				char[] array5 = new char[numberOfDigits];
				Arrays.fill(array5, '5');
				bdn = new String(array5);
			}
			else{
				for(int numberOf5s = numberOfDigits -1; numberOf5s >= 0; numberOf5s--){
					if(numberOf5s % 3 == 0 && (numberOfDigits - numberOf5s) % 5 == 0){
						char[] array3 = new char[numberOfDigits - numberOf5s];
						Arrays.fill(array3, '3');
						
						char[] array5 = new char[numberOf5s];
						Arrays.fill(array5, '5');
						
						bdn = new String(array5) + new String(array3);
						break;
						}
					}
				}
			
			if(bdn.equals("")){
				if(numberOfDigits % 5 == 0){
					char[] array3 = new char[numberOfDigits];
					Arrays.fill(array3, '3');
					
					bdn = new String(array3);
				}
			}
			
			if(bdn.equals("")){
				bdn = "-1";
			}
			
			System.out.println(bdn);
			
			
		}
		in.close();
		
	}

}
