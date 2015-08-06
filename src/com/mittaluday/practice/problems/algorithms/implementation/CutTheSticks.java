package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int numSticks = in.nextInt();
		List<Integer> sticksArray = new ArrayList<Integer>();
		
		/* Construct the input sticks array */
		for(int i = 0; i< numSticks; i++){
			sticksArray.add(in.nextInt());
		}
		
		while(!sticksArray.isEmpty()){
			System.out.println(sticksArray.size());
			Integer minStickLength = Collections.min(sticksArray);
			for (Integer stick : sticksArray) {
				if(stick != minStickLength)
					stick -= minStickLength;
			}
			sticksArray.removeAll(Collections.singleton(minStickLength));
		}
		
		in.close();
		
	}

}
