package com.pract.java;

public class SecondLargestUsingForloop {

	public static void main(String[] args) {

		int[] ArrayNum = { 10 , 20 , 51 , 12 ,  10 ,  46 ,  51 ,  51 , 20 };

		System.out.println(larg(ArrayNum));

	}

	static int larg(int num[]) {

		int first_max = 0;
		int second_max = 0;

		for ( int i = 0 ; i<num.length ; i++) {

			if (num[i]>first_max) {

				second_max = first_max;
				first_max = num[i];
			}

			else if (num[i]  > second_max  && num[i] != first_max)

				second_max = num[i];

		}
		return second_max;

	}



}
