package com.ilpbatch4.utility;
//2
public class DescendAscend {
		 
		public static void main(String[] args) {
			int input1 = 5;
			int input2 = 19;
			int input3 = 45;
			int input4 = 33;
			ascendingOrder(input1, input2, input3, input4);
	 
		}
	 
		private static void ascendingOrder(int input1, int input2, int input3, int input4) {
		   if(input1 < input2) {
			   input1 = input1 + input2;
			   input2 = input1 - input2;
			   input1 = input1 - input2;
		   }
		   if(input1 < input3) {
			   input1 = input1 + input3;
			   input3 = input1 - input3;
			   input1 = input1 - input3;
		   }
		   if(input1 < input4) {
			   input1 = input1 + input4;
			   input4 = input1 - input4;
			   input1 = input1 - input4;
		   }
		   if(input2 < input3) {
			   input2 = input2 + input3;
			   input3 = input2 - input3;
			   input2 = input2 - input3;
		   }
		   if(input2 < input4) {
			   input2 = input2 + input4;
			   input4 = input2 - input4;
			   input2 = input2 - input4;
		   }
		   if(input3 < input4) {
			   input3 = input3 + input4;
			   input4 = input3 - input4;
			   input3 = input3 - input4;
		  	}
		   System.out.println(" "+input4+" "+input3+" "+input2+" "+input1);
		}
}
