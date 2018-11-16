package com.pract.java;

import java.util.HashSet;

public class CountDuplicate {
	
	public static void main(String[] args) {
		String original = "BETTER";
		
		System.out.println(duplicate(original) );
	}
	
	static int duplicate(String str) {
		
		 char[] charArray = str.toCharArray();
		 
		 int count= 0;
		
		HashSet<Character> value = new HashSet<Character>();

		for ( char c  : charArray)
		
		if (value.add(c)==false) {
			
			count++;
		}
		
		return count;
		
		
		
	}

}
