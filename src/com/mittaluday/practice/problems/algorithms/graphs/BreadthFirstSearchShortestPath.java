package com.mittaluday.practice.problems.algorithms.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BreadthFirstSearchShortestPath {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		final int EDGEWEIGHT = 6;
		
		int numTestCases = in.nextInt();
		for(int testCase = 0; testCase < numTestCases; testCase++){
			
			/* Fetch input meta for the current testcase */
			int numNodes = in.nextInt();
			int numEdges = in.nextInt();
			
			/* A map to store neighbours of each node in the graph */
			Map<Integer, List<Integer>> neighbourMap = new HashMap<Integer, List<Integer>>();
			
			/* Initialize the neighbourMap with an entry for numNodes */
			for(int nodeNumber = 1; nodeNumber <= numNodes; nodeNumber++){
				neighbourMap.put(nodeNumber, new ArrayList<Integer>());
			}
			
			/* Review each edge and put the input as neighbours */
			for(int edgeNumber = 0; edgeNumber < numEdges; edgeNumber++){
				int node1 = in.nextInt();
				int node2 = in.nextInt();
				neighbourMap.get(node1).add(node2);
				neighbourMap.get(node2).add(node1);
			}
		}
		in.close();
	}

}
