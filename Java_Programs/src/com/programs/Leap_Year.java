package com.programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int year;
		
		System.out.println("Enter the Year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if((year%4)==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}
