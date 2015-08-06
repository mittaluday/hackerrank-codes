package com.mittaluday.practice.problems.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		
		Character[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int alphabetsLength = alphabets.length;
		
		Scanner in = new Scanner(System.in);
		
        String outputString ="";
        int inputLength;
        String inputCharacterString;
        int k;
        
        inputLength = Integer.parseInt(in.nextLine());
        inputCharacterString = in.nextLine();
        k = Integer.parseInt(in.nextLine());
        
        for(int i = 0; i < inputLength; i++){
        	if(Arrays.asList(alphabets).contains(inputCharacterString.charAt(i))){
        		int currentIndex = Arrays.asList(alphabets).indexOf(inputCharacterString.charAt(i));
        		outputString = outputString.concat(String.valueOf(Arrays.asList(alphabets).get((currentIndex + k) % alphabetsLength)));
        	}
        	else if(Arrays.asList(alphabets).contains(inputCharacterString.toLowerCase().charAt(i))){
    			int currentIndex = Arrays.asList(alphabets).indexOf(inputCharacterString.toLowerCase().charAt(i));
        		outputString = outputString.concat(String.valueOf(Arrays.asList(alphabets).get((currentIndex + k) % alphabetsLength)).toUpperCase());
    		}
        	else{
        		outputString = outputString.concat(String.valueOf(inputCharacterString.charAt(i)));
        	}
        }
        
        System.out.println(outputString);
        in.close();
	}

}
