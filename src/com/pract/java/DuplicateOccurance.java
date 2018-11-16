package com.pract.java;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateOccurance {

	public static void main(String[] args) {
		
		int[] ArrayNum = { 10 , 20 , 51 , 12 ,  10 ,  46 ,  51 ,  51 , 20 };
		duplicate(ArrayNum);
	}
	
	static void duplicate(int num[]) {
		
		HashMap<Integer , Integer> mapvalue = new LinkedHashMap<Integer , Integer>();
		
	for(int i = 0; i<num.length ; i++) {
		
		int key = num[i];
				
	if (mapvalue.containsKey(key)) {
		
		int value = mapvalue.get(key);
		
		value++;
	
		mapvalue.put(key, value);
	}	
	else {
		mapvalue.put(key, 1);		
	}	
	}
	System.out.println(mapvalue);
		
	}
}
