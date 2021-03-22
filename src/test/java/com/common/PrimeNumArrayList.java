package com.common;

import java.util.ArrayList;

public class PrimeNumArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer>primeList = new ArrayList<>();
		
		
		for(int i = 2; i <= 100; i ++){
			boolean isPrime = true;
			for ( int j = 2; j <= Math.sqrt(i); j++){
				if (i % j == 0)
				{
					isPrime = false;
					break;
					
				}
				if (isPrime)
					primeList.add(i);
			}
			System.out.println(primeList);
			
			
		}
		

	}

}
