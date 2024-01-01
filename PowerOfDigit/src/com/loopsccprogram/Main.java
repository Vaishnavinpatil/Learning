package com.loopsccprogram;

import java.util.Scanner;

public class Main {
	//Write a java program to print the result of a number when it is raised to the power of number of digits in the number

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Pow p1=new Pow();
		int digi=p1.countNumberOfDigits(num);
		int res=p1.powerOfn(num, digi);
		System.out.println("Result when "+num+" raised to power "+digi+" is "+res);
		scan.close();

	}

}
