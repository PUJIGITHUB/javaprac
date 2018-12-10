package com.pract.java;

public class revstrwithoutsapace {


	public static void main(String[] args) {
		rev("I am in office");

	}
	public static void rev(String st) {

		String org = st;
		String rev = " ";

		String[] strArray = org.split(" ");

		for ( int i = 0 ;  i< strArray.length ; i++) {


			String word = strArray[i];

			StringBuffer sb = new StringBuffer(word);

			sb.reverse();
			System.out.print(sb);
			System.out.print( " ");

		}
		

	}
}
