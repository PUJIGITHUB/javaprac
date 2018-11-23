package com.pract.java;

import java.util.HashMap;
import java.util.Map;

public class Dulic {

	public static void main(String[] args) {

		int[] ArrayNum = { 10 , 20 , 51 , 12 ,  10 ,  46 ,  51 ,  51 , 20 };
		duplicate(ArrayNum);
	}

	static void duplicate(int num[]) {  
		Map<Integer , Integer> mapvalue = new HashMap<Integer , Integer>();

		for(int key: num){

			if (mapvalue.containsKey(key)) {  
				mapvalue.put(key, mapvalue.get(key)+1);
			} 
			else {
				mapvalue.put(key, 1);  
			} 
		}
		

		for (Map.Entry<Integer,Integer> entry : mapvalue.entrySet())  {
			if(entry.getValue()>1){
				System.out.println("Key = " + entry.getKey() + 
						", Value = " + entry.getValue()); 
			}                    
		} 
	}
}
