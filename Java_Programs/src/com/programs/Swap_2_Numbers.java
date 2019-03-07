package com.programs;

public class Swap_2_Numbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		System.out.println("Before Swap");
		System.out.println("X value:"+x);
		System.out.println("Y value:"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap");
		System.out.println("X value:"+x);
		System.out.println("Y value:"+y);
		

	}

}
