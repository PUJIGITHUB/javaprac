package com.pract.java;

import java.util.LinkedHashSet;

public class Removeduplicatefromstring {


	public static void main(String[] args) {
		String originalString = "BETTER";
		removeDuplicateChars(originalString);
	}

	private static void removeDuplicateChars(String originalString) {
		
		// store in char Array
		char[] chrArray = originalString.toCharArray();
		
		// create a set object
		LinkedHashSet<Character> setValue = new LinkedHashSet<Character>();
		
		for (char value : chrArray) {
			setValue.add(value);
		}

		System.out.println(setValue);
	}
}


