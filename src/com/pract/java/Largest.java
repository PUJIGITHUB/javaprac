package com.pract.java;

public class Largest {
	
	
public static void main(String[] args) {
		
		int[] ArrayNum = { 10 , 20 , 51 , 12 ,  10 ,  46 ,  51 ,  51 , 20 };
		System.out.println(larg(ArrayNum));
		
	}

static int larg(int num[]) {
	
	int first_max = 0;
	
	//int second_max = 0;
			
			for ( int i = 0 ; i<num.length ; i++) {
				
				if (num[i]>first_max) {
					
					first_max = num[i];
				}
				
			
			}
			return first_max;

	
	
	
}
}
