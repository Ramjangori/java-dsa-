package com.dsaStart;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		int arr[] = {3,5,6,7,6,8,3,4,5};
	    Map<Integer, Integer> mp = new HashMap<>();
	    for(int i=0 ; i<arr.length ; i++){
	        if(mp.containsKey(arr[i])){
	        	int v = mp.get(arr[i]);
	        	v++;
	            mp.put(arr[i],v);
	        }
	        else{
	            mp.put(arr[i],1);
	        }
	    }
	    
  
	}
}

