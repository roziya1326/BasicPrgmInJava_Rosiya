package com.ilpbatch4.utility;
//4
public class Fibonacchi {

	public static void main(String[] args) {
		int firstTerm = 1;
		int secondTerm = 2;
		getFibonacchi(firstTerm,secondTerm);
	}

	private static void getFibonacchi(int firstTerm, int secondTerm) {
		int n = 3;
		int sum = (int) Math.pow(firstTerm,3)+ (int) Math.pow(secondTerm,3);
		int nextTerm = 0;
		for(int i = 0;i < n;i++) {
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm; 
			secondTerm = nextTerm;
			sum = sum + (int) Math.pow(nextTerm,3);
		}
		System.out.println("The sum is "+sum);
	}

}
