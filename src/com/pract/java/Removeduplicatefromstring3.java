package com.pract.java;

public class Removeduplicatefromstring3 {

	public static void main(String[] args) {

		String originalString = "today is rainy day";

		// yadot si yniar yad

		String[] str = originalString.split(" ");

		String reversed = "";
		
		for (int i = 0; i < str.length; i++) {

			String str2 = str[i];

			char[] charArray = str2.toCharArray();

			char[] reverse = new char[charArray.length];
			for (int j = charArray.length - 1; j >= 0; j--) {

				reverse[charArray.length - (j +1)] = charArray[j];
			}

			reversed = reverse.toString();
			
		}

		System.out.println(reversed);
	}
}
