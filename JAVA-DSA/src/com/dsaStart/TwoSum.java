package com.dsaStart;

import java.util.HashMap;

// Find target element using hashnmap
public class TwoSum {
  public static void main(String[] args) {
	 int arr[] = {2,3,4,5,7,8,9,10};
	 int target = 7;
	 HashMap<Integer , Integer> hs = new HashMap<>();
	 
	 for(int i=0 ; i<arr.length ; i++) {
		 int x = target - arr[i];
		 if(hs.containsKey(x)) {
			 System.out.println("Yes :" + x  +  " "+ arr[i]);
			 break;
		 }
		 else {
			 hs.put(arr[i], i);
		 }
	 }
}
}
