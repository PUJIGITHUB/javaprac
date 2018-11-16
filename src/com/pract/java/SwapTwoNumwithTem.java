package com.pract.java;

public class SwapTwoNumwithTem {


	public static void main(String[] args) {

		swap(20 , 50);
	}


	static void swap( int i , int j) {

		int temp;

		temp = i;
		i =j;
		j = temp;


		System.out.println( "First element is " +i );
		System.out.println( "Second  element is " +j );
	}

}
