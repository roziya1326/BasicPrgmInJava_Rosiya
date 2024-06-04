package com.ilpbatch4.utility;
//1
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1 = 2, input2 = 20, input3 = 8;
		if (input1 < input2) {
			input1 = input1 + input2;
			input2 = input1 - input2;
			input1 = input1 - input2;
		}
		if(input1 < input3) {
			input1 = input1 + input3;
			input3 = input1 - input3;
			input1 = input1 - input3;
		}
		if(input2 < input3) {
			input2 = input2 + input3;
			input3 = input2 - input3;
			input2 = input2 - input3;
		}
		System.out.print(input1+" "+input2+" "+input3);
	}

}
