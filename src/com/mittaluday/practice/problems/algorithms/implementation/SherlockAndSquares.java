package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		
		for(int testCase = 0; testCase < numTestCases; testCase++){
			int lowerBound = in.nextInt();
			int upperBound = in.nextInt();
			int solution = 0;
			
			double lbsqrt = Math.sqrt(lowerBound);
			double ubsqrt = Math.sqrt(upperBound);
			
			for(double squareRoot = Math.ceil(lbsqrt); squareRoot <= Math.floor(ubsqrt); squareRoot++){
				double currentSquare = Math.pow(squareRoot, 2);
				if(currentSquare > upperBound)
					break;
				if(currentSquare >= lowerBound && currentSquare <= upperBound)
					solution += 1;
			}
			 
			System.out.println(String.valueOf(solution));
		}
		in.close();
	}
}
