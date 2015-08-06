package com.mittaluday.practice.problems.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {
	
	static BigInteger factorial(BigInteger number){
		if(number.intValue() == 1){
			return new BigInteger("1");
		}
		else{
			return number.multiply(factorial(number.subtract(new BigInteger("1"))));
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		BigInteger number = in.nextBigInteger();
		BigInteger fact;
		fact = factorial(number);
		System.out.println(fact.toString());
		in.close();
	}

}
