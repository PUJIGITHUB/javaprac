package com.pract.java;

public class Fabonaci {

	public static void main(String[] args) {
		fabonaci();
	}
	
	static void fabonaci() {
		
		
		int sum , nextnum = 1 , previounum = 0 ;
		
		for ( int i = 1 ;  i <= 15;  i++) {
			
			sum = nextnum+previounum;
			previounum = nextnum;
			nextnum = sum;
			
			
			System.out.print(sum +" " );
		}
	}
}
