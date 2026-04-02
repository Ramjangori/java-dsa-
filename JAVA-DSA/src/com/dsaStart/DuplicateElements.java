package com.dsaStart;

public class DuplicateElements {
   public static void main(String[] args) {
	int arr[] = {4,3,2,7,8,2,3,1};
	
	for(int i=0 ; i<arr.length ; i++) {
		
		int v = arr[i];
		if(v<0)  v = v*-1;
		arr[v-1] = arr[v-1]*-1;
		
	}
	for(int i=0 ; i<arr.length ; i++) {
		if(arr[i]>0) {
			System.out.println(arr[i]);
		}
	}
}
}
