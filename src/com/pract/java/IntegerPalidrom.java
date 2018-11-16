package com.pract.java;

public class IntegerPalidrom {

	public static void main(String[] args) {
		intpali(12321);
		intpali(123211);
	}

	static void intpali(int num) {

		int originalNum = num;
		int reverse = 0;
		while(num!=0) {

			reverse = reverse*10 + num%10 ;			
			num/=10;
		}

		if ( reverse == originalNum) {

			System.out.println(" Given no " + originalNum + " is Palindrome");
		}

		else 
		{

			System.out.println(" Given no " + originalNum +" Not Palindrome");
		}

	}
}
