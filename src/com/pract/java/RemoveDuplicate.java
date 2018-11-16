package com.pract.java;

import java.util.Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {	
		Integer[] a = {20 , 21 , 25 , 54 , 87 , 54 , 21 , 89 };	
		removeDuplicate(a);		
	}

	static void  removeDuplicate(Integer[] c) {

		//List<Integer> list = Arrays.asList(c);
		HashSet<Integer> setvalue = new LinkedHashSet<Integer>();
		List<Integer> dup = new LinkedList<Integer>();
		//int total = list.size();
		int total = c.length;
		
		for ( int i = 0 ; i<total ; i++) {

			//int num = list.get(i);
			
			int num = c[i];

			if (setvalue.add(num)== true ) {

				setvalue.add(num);
			}
			else {

				dup.add(num);
			}		   
		}

		System.out.println(setvalue);    
		System.out.println(dup);	
	}
}
