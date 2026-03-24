package com.dsaStart;

import java.util.HashSet;
import java.util.Set;

public class TotalUniqueElement {
   public static void main(String[] args) {
	   int arr[] = {5,5,8,8};
	   Set<Integer> set = new HashSet<>();
	   for(int i =0 ; i<arr.length ; i++) {
		   set.add(arr[i]);
	   }
	   System.out.println(set.size());
}
}
