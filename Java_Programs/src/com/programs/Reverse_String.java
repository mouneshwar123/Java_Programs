package com.programs;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String org,rev="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to Reverse");
		org=sc.nextLine();
		
		int len=org.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("Reverse of String:"+rev);
	}

}
