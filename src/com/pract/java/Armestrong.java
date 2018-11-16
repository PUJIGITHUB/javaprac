package com.pract.java;

public class Armestrong {

	public static void main(String[] args) {
		arms( 371);

	}

	static void arms( int number) {

		int originalNum , remainder , result = 0;

		originalNum  = number;
		while(originalNum!=0) {

			remainder = originalNum%10;

			result += Math.pow(remainder, 3);

			// result = result + remainder * remainder * remainder

 			originalNum/=10;
		}

		if ( number ==result) {

			System.out.println("Armestrong num");
		}

		else {

			System.out.println(" Not Armestrong num");
		}
	}

}
