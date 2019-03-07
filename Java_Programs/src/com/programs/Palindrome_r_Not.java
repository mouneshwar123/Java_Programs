package com.programs;

import java.util.Scanner;

public class Palindrome_r_Not {

	public static void main(String[] args) {
		int num,sum=0,rem,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while(num!=0) 
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
