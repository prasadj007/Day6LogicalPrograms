package com.bridgelabz.logical;

import java.util.*;
public class UC3PrimeNumCheck {

	public static void main(String args[]){
		int i,m=0,flag=0;
		System.out.println("Enter Num to Check Prime");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		m=n/2;
		if(n==0||n==1){
			System.out.println(n+" is not a prime number.");
		}
		else{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0) { System.out.println(n+" is a prime number."); }
		}
	}
}

