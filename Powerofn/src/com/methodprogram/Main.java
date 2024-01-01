package com.methodprogram;

import java.util.Scanner;

public class Main {
	//Write a java program to print the result of a number when it is raised to the power of n

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the power raised to");
		int n=scan.nextInt();
		Power p1=new Power();
		System.out.println(p1.powerOfn(num,n));
		scan.close();

	}

}
