package com.pract.java;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(6));
	}


	static int factorial(int a) {

		int fact = 1;


		for ( int i = 1 ; i<=a ; i++)


			fact = fact*i;

		return fact;



	}
}
