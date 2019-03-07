package com.programs;

import java.util.Scanner;

public class Convertion {

	public static void main(String[] args) {
		int num,months,days;
		
		System.out.println("Enter the days to convert");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		months=num/30;
		days=num%30;
		
		System.out.println("Months: "+months);
		System.out.println("Days  :"+days);

	}

}
