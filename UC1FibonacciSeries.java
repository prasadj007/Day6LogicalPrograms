package com.bridgelabz.logical;

import java.util.*;
public class UC1FibonacciSeries {

	static void Fib(int N)
		{
			int num1 = 0, num2 = 1;

			int count = 0;

			while (count < N) {

			
				System.out.print(num1 + " ");

				int num3 = num2 + num1;
				num1 = num2;
				num2 = num3;
				count = count + 1;
			}
		}

		
		public static void main(String args[])
		{
			System.out.println("Enter a Number to Print Fibonacci Series Upto");
			Scanner scan= new Scanner(System.in);
			int N=scan.nextInt();
			Fib(N);
		}
	}

