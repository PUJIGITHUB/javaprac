package com.pract.java;

import java.util.LinkedHashSet;

public class Removeduplicatefromstring2 {
	public static void main(String[] args) {
		String originalString = "BETTER";
		removeDuplicateChars(originalString);

		System.out.println(removeDuplicateChars(originalString));
	}

	private static String removeDuplicateChars(String originalString) {
		char[] chrArray = originalString.toCharArray();
		LinkedHashSet<Character> setValue = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();

		for (char value : chrArray) {
			setValue.add(value);
		}

		 for(char ch:setValue){
			         sb.append(ch);
			        }
			        return sb.toString();	
	}

	
}
