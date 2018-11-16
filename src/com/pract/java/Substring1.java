package com.pract.java;

public class Substring1 {

	public static void main(String[] args) {
		String str =  "I am a gud girl";
		
		sub(str);
	}

	static void sub( String st) {
		
	int a = st.indexOf("am ");
	
	System.out.println(a);
	
	
	 int b = st.indexOf('a');
	 System.out.println(b);
		
	}


}
