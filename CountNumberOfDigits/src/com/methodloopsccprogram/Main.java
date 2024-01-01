package com.methodloopsccprogram;

import java.util.Scanner;

public class Main {
	//Write a java Program To Count the number of digits of present in a number

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Count c1=new Count();
		int res=c1.countNumberOfDigits(n);
		System.out.println("Number of digits in "+n+" is "+res);
		scan.close();
	}

}
