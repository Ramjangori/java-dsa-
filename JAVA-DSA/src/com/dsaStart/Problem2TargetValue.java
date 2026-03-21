package com.dsaStart;
// Found target element 
public class Problem2TargetValue {
   public static void main(String[] args) {
	 int arr[] = {2,3,4,5,6,7,8};
	 int target = 13;
	 
	 for(int i=0 ; i<arr.length ; i++) {
		 for(int j = i+1 ; j<arr.length ; j++) {
			 
			 if(arr[i]+arr[j]==target) {
				 System.out.println("Target element found..");
				 System.out.println("values : " + arr[i]);
				 System.out.println("values : " + arr[j]);
				     break;
				 
			 }
		 }
	 }
	 
}
}
