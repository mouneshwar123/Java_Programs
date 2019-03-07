package com.programs;

import java.util.Scanner;

public class Sum_of_Naturals {

	public static void main(String[] args) {
		int num,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		for(int i=1;i<=num;++i)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Numbers:"+sum);
		

	}

}
