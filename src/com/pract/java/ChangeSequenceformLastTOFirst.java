package com.pract.java;

public class ChangeSequenceformLastTOFirst {
	
	public static void main(String[] args) {
		String original = " John is going office";
		
		System.out.println(reverse(original));
	}

	
static String reverse(String str) {
		
	 String[] word = str.split(" "); 
	 
	 String ReverseString = " ";
	 
	 for ( int i = word.length-1 ; i>=0  ; i--) {
		 
		 ReverseString = ReverseString+word[i] +" ";
		 
	 }
	return ReverseString;
		
		
	}
}
