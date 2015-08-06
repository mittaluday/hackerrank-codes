package com.mittaluday.practice.problems.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {
	public static void insertionSortPart2(int[] ar, int currentValuePosition)
    {    
		int lastValue = ar[currentValuePosition];
		int position = currentValuePosition;
		for(int i = 0; i< currentValuePosition; i++){
			if(ar[i] <= lastValue){
				continue;
			}
			else{
				position = i;
				for(int j = currentValuePosition; j > position; j--){
					ar[j] = ar[j-1];
				}
				ar[position] = lastValue;
				break;
			}
		}
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       
       for(int i=0; i<s; i++){
    	   insertionSortPart2(ar, i);
    	   if(i!=0)
    		   printArray(ar);
       }
       in.close();
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

}
