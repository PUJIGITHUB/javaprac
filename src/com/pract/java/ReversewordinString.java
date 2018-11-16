package com.pract.java;

public class ReversewordinString {

	
	public static void main(String[] args) {
		
		String str = " Today is my day";
		
		String  rev = reverse(str);
		
		System.out.println(rev);
	}
	
	static String reverse(String str) {
		
		String[] words = str.split(" ");
		
		String reverseString = " ";
		
		for ( int i = 0 ; i<words.length ; i++) {
			
			String word = words[i];
			
			String reverseWord = " ";
			
			for (int j = word.length()- 1 ; j>=0 ; j--) {
				
				
				reverseWord = reverseWord + word.charAt(j);
				          	
			}
			reverseString = reverseString + reverseWord ;
		}
		return reverseString;
		
	}
}


