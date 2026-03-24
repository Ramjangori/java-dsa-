package com.dsaStart;

public class Palindrone {
	  public static boolean isPalindrome(int x) {
	        
	        int org = x;
	        int rev=0;
	        if(x<0) {
	        	return false;
	        }
	       
	        while(x!=0){
	            rev = rev*10 + x%10;
	            x/=10;
	        }
	        System.out.println(org);
	        System.out.println(rev);
	        if(org==rev){
	            return true;
	        }
	        else{
	            return false;
	        }
	        

	    }
	  
	  public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));
		
	}
}
