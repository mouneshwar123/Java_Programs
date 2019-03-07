package com.programs;

import java.util.Scanner;

public class Largest_Of_3 {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three Numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y&&x>z)
		{
			System.out.println("First Number is Largest");
		}
		else if(y>x&&y>z)
		{
			System.out.println("Second Number is Largest");
		}
		else if(z>x&&z>y)
		{
			System.out.println("Third Number is Largest");
		}
		else
		{
			System.out.println("The Numbers are not Distinct");
		}

	}

}
