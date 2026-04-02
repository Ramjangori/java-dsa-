package com.sort;

public class InsertionSort {
  public static void main(String[] args) {
	int arr[] = {3,6,7,2,1,8,9,10,45,33,23,76,44};
	 for(int i = 1 ; i<arr.length ; i++) {
		 int temp = arr[i];
		 int j=i-1;
		 for(; j>=0 ; j--) {
			 if(arr[j]>temp) {
				 arr[j+1] = arr[j];
			 }
			 else {
				 break;
			 }
		 }
		 arr[j+1] = temp;
	 }
}
}
