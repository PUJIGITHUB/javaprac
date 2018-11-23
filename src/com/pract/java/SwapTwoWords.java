package com.pract.java;

public class SwapTwoWords {

	

	public static void main(String[] args) {
		String str = "Today is rainy day is";
		swap(str);
	}

	static void swap(String org) {
		String[] strArray = org.split(" ");

		int leg = strArray.length;

		String[] res = new String[leg];


		for ( int i = 1; i<leg ; i++) {
			strArray[i] = res[i];

			if(strArray[i].equals("is") ) {

				res[i] = "day";
			}	 
			else if(strArray[i].equals("day")) {

				res[i] = "is";
			}

		}
		for ( String resStr:res ) {

			System.out.println(resStr+ " ");

		}


	}	
}


