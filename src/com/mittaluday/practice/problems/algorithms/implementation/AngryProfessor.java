package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int numTestCases = in.nextInt();
		
		for(int testCase = 0; testCase < numTestCases; testCase++){
			int n = in.nextInt();
			int k = in.nextInt();
			
			int totalStudentsEntered = 0;
			for(int studentId = 0; studentId < n; studentId++){
				if(in.nextInt() <= 0){
					totalStudentsEntered += 1;
				}
			}
			if(totalStudentsEntered >= k){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
		in.close();
	}

}
