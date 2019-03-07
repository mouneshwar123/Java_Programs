package com.programs;

import java.util.Scanner;

public class Positve_r_Negative {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("POSITIVE");
		}
		else
		{
			System.out.println("NEGATIVE");
		}
	}

}
