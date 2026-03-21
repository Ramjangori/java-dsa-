package com.dsaStart;

public class Problem1ArraySum {
	    public static void main(String[] args) {
	        int arr[] = {7,7,3,4};
	        int sum = 0;
	        for(int i = 0; i<arr.length ; i++){
	            sum = sum + arr[i];
	            if(sum>6){
	                sum = sum%7;
	            }
	        }
	        
	        if(sum==0){
	             System.out.println("sum of array is Divisible by 7");
	        }
	        else{
	            System.out.println("Not divisible by 7");
	        }
	       
	    }
}
	
	
	
	
	

