package com.common;

import java.util.Scanner;

public class PalimdromeDemoJava {

	public static void main(String[] args) {
		String userInput;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		userInput = scan.nextLine();
		isPalindrome (userInput);
		

	}
	
	public static boolean isPalindrome(String userInput ){
		
		for (int i = 0; i <= userInput.length() / 2; i ++){
		
		if (userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)){
			
			System.out.println("This is not a Palindrome");
			
			return false;
			
		}
		
		}
		
		System.out.println("This is a Palindrome");
		return true;
		
		
		
		
	}

}
