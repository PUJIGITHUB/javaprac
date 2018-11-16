package com.pract.java;

public class Wovels {
	
	public static void main(String[] args) {
		
		String str = "POOJA KANWAR #%@&";
		wov( str );
		
	}

	
	static void wov( String s ) {
		
		int wovels = 0 ;
		int constant = 0;
		
		int special = 0;
		
		for ( int i = 0 ; i<s.length() ; i++) {
			
			Character c = s.charAt(i);
					
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
                    'o' || c == 'u') {
				
				wovels++;
				
			}
			
			else if(c== ' '){
			
			
				
			}
			
			else if (!Character.isSpaceChar(c)&& !Character.isLetterOrDigit(c)){
				
				special++;
				
			} 
			else{
				
				constant++;
			}


			}
		
		System.out.println( " total vowel: " +wovels);
		System.out.println( " total constant: " +constant);
		System.out.println( " total special: " +special);
		
		}


	
		
	}

