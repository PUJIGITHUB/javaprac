package com.pract.java;

public class Binary {

	public static void main(String[] args) {
		binary(10101);
		binary(11313);
		binary(32353);
		binary(101011111);
	}

	static void binary(int num) {
		int org  = num;
		boolean isBinary = true;

		int temp = 0;

		while( num !=0) {

			temp = num%10;

			if ( temp >1) {
				isBinary = false;
				break;
			}

			else {

				num/=10;
			}


		}
		if (isBinary) {

			System.out.println( org +" num is binary");

		}

		else {

			System.out.println( org +" num is not  binary");



		}
	}
}



