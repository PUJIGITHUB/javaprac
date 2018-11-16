package com.pract.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestUsingCollection {
	
	
	public static void main(String[] args) {
		
		Integer[] a = {10 , 20 , 5 , 6 , 8 , 10 , 15};
	    
	    System.out.println(SecondLargest( a));
	   }
	   
	   static int SecondLargest(Integer[] c) {
	    
	    List<Integer> list = Arrays.asList(c);
	    Collections.sort(list);
	    int total = list.size();
	    Integer element = list.get(total-2);
	    
	    
	    return element;
	    
	    
	    
	   }

}
