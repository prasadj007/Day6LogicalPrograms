package com.bridgelabz.logical;

import java.util.*;
public class UC4ReverseNum {  
	public static void main(String[] args)   
	{  
		System.out.println("Enter Num to Reverse:");
		Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		int reverse = 0;  
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  

