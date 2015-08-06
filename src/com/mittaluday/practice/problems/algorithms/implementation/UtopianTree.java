package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		
		for(int testCase = 0; testCase < numTestCases; testCase++){
			
			int numCycles = in.nextInt();
			int treeHeight = 1;
			
			for(int cycle = 0; cycle < numCycles; cycle++){
				if(cycle % 2 == 0){
					treeHeight *= 2;
				}
				else
				{
					treeHeight += 1;
				}
			}
			System.out.println(treeHeight);
			
		}
		
		in.close();
	}

}
