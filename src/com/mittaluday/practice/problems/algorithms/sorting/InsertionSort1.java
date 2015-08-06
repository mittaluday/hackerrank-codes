package com.mittaluday.practice.problems.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort1 {
	public static void insertIntoSorted(int[] ar) {
		int lastValue = ar[ar.length -1];
		int position = 0;
		for(int i = 0; i< ar.length; i++){
			if(ar[i] <= lastValue){
				continue;
			}
			else{
				position = i;
				break;
			}
		}
		for(int i = ar.length - 1; i > position; i--){
			ar[i] = ar[i-1];
			printArray(ar);
		}
		ar[position] = lastValue;
		printArray(ar);
	}
    
    
	/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
         in.close();
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
