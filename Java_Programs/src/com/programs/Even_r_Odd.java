package com.programs;

import java.util.Scanner;

public class Even_r_Odd {

	public static void main(String[] args) {
		int x;
		
		System.out.println("Enter an Integer");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
