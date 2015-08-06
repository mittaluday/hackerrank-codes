package com.mittaluday.practice.problems.algorithms.implementation;

import java.util.Scanner;

public class SongOfPie {

	public static void main(String[] args) {
			
			String isSong = "It's a pi song.";
			String isNotSong = "It's not a pi song.";
			String pi = "31415926535897932384626433833";
		
			Scanner in = new Scanner(System.in);
			int numTestCases = Integer.parseInt(in.nextLine());
			
			for(int testCase = 0; testCase < numTestCases; testCase++){
				
				String song = in.nextLine();
				String[] wordsInSong = song.split(" ");
				String currentPi = "";
				
				for (String word : wordsInSong)
					currentPi += String.valueOf(word.length());
				
				if(pi.startsWith(currentPi))
					System.out.println(isSong);
				else
					System.out.println(isNotSong);
			}
			in.close();
	}

}
