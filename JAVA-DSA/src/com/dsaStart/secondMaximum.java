package com.dsaStart;

public class secondMaximum {
	public static void main(String[] args) {
		int arr[] = {3,2,1};
		int max =Integer.MIN_VALUE;
		int smax =Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;
		for(int i=0 ; i< arr.length ; i++) {
			if(max<arr[i]) {
				tmax = smax;
				smax = max;
				max = arr[i];
			}
			else if(smax<arr[i]) {
				  tmax=smax;
				  smax=arr[i];
			}
			else if(tmax<arr[i]) {
				tmax=arr[i];
			}
			
		}
		 System.out.println(tmax);
	}

}
