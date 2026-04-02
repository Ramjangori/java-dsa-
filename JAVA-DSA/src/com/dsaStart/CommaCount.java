package com.dsaStart;

public class CommaCount {
	public static void main(String[] args) {
		int num = 345660;
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println(count);
		int rem = count%3;
		int comma = (count/3)-1+rem;
	    System.out.println("Comma : "+ comma );
	}

}
