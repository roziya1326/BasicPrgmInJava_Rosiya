package com.ilpbatch4.utility;
//9
public class SortArray { 
	    public static void main(String[] args) {
	        int arr[] = {0, 1, 1, 0, 2,0,2,0, 1, 0};
	        sortZeroOneTwo(arr);
	    }
	 
	    public static void sortZeroOneTwo(int arr[]) {
	       
	        for (int i = 0; i <= arr.length-1; i++) {
	        	for(int j=i+1;j<=arr.length-1;j++) {
	        		if(arr[i]>=arr[j]) {
	        			int temp=arr[i];
	        			arr[i]=arr[j];
	        			arr[j]=temp;
	        			
	        		}
	        	}
	            
	        }
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	    }
	
}
