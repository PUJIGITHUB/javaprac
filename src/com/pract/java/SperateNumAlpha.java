package com.pract.java;

public class SperateNumAlpha {

	
	public static void main(String[] args) {
			
		String str = "pooja12rath5";		
		num(str);		
	}
	static void num( String s ) {
		
	       int lenght = s.length();       
	       String digit = " ";	       
	       String alpha = " ";
	     
	       for(int i= 0 ; i< lenght ; i++) {
	    	   
	    	   Character c = s.charAt(i);
	    	   if ( Character.isDigit(c)) {
	    		    		   
	    		   digit =  digit +c;    		   
	    	   }
	    	   	    	   else {
	    		   
	    		   alpha = alpha+c;
	    	   }
	       }
	
	       System.out.println(" Num = "+digit);
	       System.out.println("Alphabates ="  +alpha);
		
	}
	}


