package com.dsaStart;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
	public static int[] plusOne(int[] digits) {

		long number = 0;
		for (int i = 0; i < digits.length; i++) {
			number = number * 10 + digits[i];
		}
		number = number + 1;

		ArrayList<Integer> arlist = new ArrayList<>();

		Collections.reverse(arlist);
      
		int[] arr = new int[arlist.size()];
          
		for (int i =0; i <arlist.size(); i++) {
			arr[i] = arlist.get(i);
			
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
      
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2};
	     plusOne(arr);

	}
}
