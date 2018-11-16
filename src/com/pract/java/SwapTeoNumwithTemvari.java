package com.pract.java;

public class SwapTeoNumwithTemvari {

	public static void main(String[] args) {

		swap(12 , 55);
	}

	static void swap(int a , int b) {

	a = a+b;
	b = a-b;
	a = a-b;

	System.out.println(" b value is now :"+ a);
	System.out.println(" a value is now :"+ b);

}
	/*static void swap(int a , int b) {

		a = a*b;
		b = a/b;
		a = a/b;

		System.out.println(" b value is now :"+ a);
		System.out.println(" a value is now :"+ b);

	}*/

}
