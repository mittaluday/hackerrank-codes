package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numPointsOnServiceLane = in.nextInt();
		int numTestCases = in.nextInt();
		Integer[] serviceLane = new Integer[numPointsOnServiceLane];
		
		
		/* Construct the service lane */
		for(int i = 0; i < numPointsOnServiceLane; i++){
			serviceLane[i] = in.nextInt();
		}
		
		for(int testCase = 0; testCase < numTestCases; testCase++){
			int entryPoint = in.nextInt();
			int exitPoint = in.nextInt();
			
			int minWidth = Collections.min(Arrays.asList(Arrays.copyOfRange(serviceLane, entryPoint, exitPoint+1)));
			
			System.out.println(String.valueOf(minWidth));
			
		}
		
		in.close();
	}

}
