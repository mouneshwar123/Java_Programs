package com.programs;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		int num,org_num,rem,result=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		org_num=num;
		while(org_num!=0)
		{
			rem=org_num%10;
			result+=Math.pow(rem, 3);
			org_num/=10;
		}
		
		if(result==num)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}

	}

}
