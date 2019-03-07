package com.programs;

import java.util.Scanner;

public class Binary_To_Decimal {

		public static void main(String[] args) {
			int bin;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the binary Number");;
			bin=sc.nextInt();
			
			System.out.println("Decimal Representation is:"+Integer.parseInt(""+bin,2));
		

	}

}
