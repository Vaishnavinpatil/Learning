package com.methodprogram;

import java.util.Scanner;

public class Main {
	//Write a java program to print the result of a number when it is raised to the power of 2
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Poweroftwo p1=new Poweroftwo();
		System.out.println(p1.Power(n));
		scan.close();

	}

}
