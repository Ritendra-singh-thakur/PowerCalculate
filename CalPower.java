package com.calculatepow;

import java.util.Scanner;

public class CalPower {
	public static void main(String[] args) {
		// Calculate Power of a Number: Write a program to calculate x raised to the
		
		Scanner sc = new Scanner(System.in);
		int temp = 1;
		System.out.println("enter the num");
		int num = sc.nextInt();
		System.out.println("enter the power of a num");
		int pow = sc.nextInt();
        
		for (int i = 1; i <= pow; i++) {
			temp = temp * num;
		}
		System.out.println(num+" raised to the power of " + pow + " is =" + temp);
	}
}