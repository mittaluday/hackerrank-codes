package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }
    
    private static long Solve(int N, int C, int M){
    	int totalChocolates = (int) Math.floor(N/C);
    	int wrappers = totalChocolates;
    	while(wrappers >= M){
    		int extraChocolates =(int) Math.floor(wrappers/M); 
    		totalChocolates += extraChocolates;
    		wrappers = wrappers - (M * extraChocolates) + extraChocolates; 
    	}
    	
    	return totalChocolates;
    }
    
    

}
	