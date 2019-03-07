package com.programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0){
				{
					isPrime=false;
				}
			}
		}
		if(isPrime)
		{
			System.out.println("Prime_Number");
		}
		else
		{
			System.out.println("Not a prime");
		}

	}

}
