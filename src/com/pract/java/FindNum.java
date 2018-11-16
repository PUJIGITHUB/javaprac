package com.pract.java;

public class FindNum {
	
public static void main(String[] args) {
	
	
	String str = "pooja12rath5";
	System.out.println(num( str ));
	
	
}


static int num( String s ) {
	
       int lenght = s.length();
       
       int num = 0; ;
     
       for(int i= 0 ; i< lenght ; i++) {
    	   
    	   Character c = s.charAt(i);
    	   if ( Character.isDigit(c)) {
    		    		   
    		   num++;
    	   }
    	   
       }
	return num;
	
}



}
