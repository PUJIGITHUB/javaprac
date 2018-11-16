package com.pract.java;

public class DoubleNumSeries {

	public static void main(String[] args) {
		doubleSeries();
	}
	static void doubleSeries() {

		int num = 1;

		for ( int i = 1 ; i<=10 ; i++) {

			num = 2*num;

			System.out.print(num + " ");
		}

	}
}