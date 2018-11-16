package com.pract.java;



public class Test {
	public static void main(String[] args) {
        String originalString = "BETTER";
        System.out.println(removeDuplicateChars(originalString));

    }
 
    private static String removeDuplicateChars(String originalString) {
        char[] chrArray = originalString.toCharArray();
        String stringValue = "";
 
        
        //IndexOf(String substring) -  This Java method returns the index within this string of the first occurrence of the specified character. 
        //It returns -1 if the character does not occur.
       
        for (char value : chrArray) {
            if (stringValue.indexOf(value) == -1) {
             stringValue += value; 
            }
        }
        return stringValue;
    }

}
		
	

	

	
	
