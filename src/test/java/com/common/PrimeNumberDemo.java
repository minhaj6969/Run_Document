package com.common;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		
		
		for ( int i =2; i <= 100; i++)
		{
		    
			Boolean isPrime = true;
			
			for (int j = 2; j <= i -1; j++)
			{
				
				if (i % j == 0 ){
					isPrime = false;
					break;
				
				
				}
				
				
			}
			if (isPrime == true){
				
				System.out.println(i);
				System.out.println("\t");
				
				
			}
			
			
		}

	}

}
