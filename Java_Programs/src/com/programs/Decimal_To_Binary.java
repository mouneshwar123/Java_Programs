package com.programs;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		int deci;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the decimal Number");;
		deci=sc.nextInt();
		
		System.out.println("Binary Representation is:"+Integer.toBinaryString(deci));
		

	}

}
