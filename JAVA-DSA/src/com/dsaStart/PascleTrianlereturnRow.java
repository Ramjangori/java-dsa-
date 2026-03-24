package com.dsaStart;

import java.util.ArrayList;
import java.util.List;

public class PascleTrianlereturnRow {
	public static void main(String[] args) {
		
		List<Integer> prev = new ArrayList<>();
		 prev.add(1);
		 int n=3;
		 for(int i=0 ; i<n-1 ; i++) {
			 List<Integer> current = new ArrayList<>();
			 current.add(1);
			 for(int j=1 ; j<prev.size() ; j++) {
				 current.add(prev.get(j)+prev.get(j-1));
			 }
			  current.add(1);
			  prev = current;
			 
		 }
		
		System.out.println(prev);
	}
}
