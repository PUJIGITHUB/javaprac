package com.pract.java;

public class ReverseNum {
	
	
	public static void main(String[] args) {		
		
		System.out.println(reverseNum(1234));
	}

	static int reverseNum(int num) {
		int reverseNum = 0;
		while(num!=0) {
			
			 int n = num%10;
			
			reverseNum = reverseNum*10 + n;
					
				num/=10;	
					
		}
		
		
		
		return reverseNum;
		
		
	}
	
	
	
	
}
