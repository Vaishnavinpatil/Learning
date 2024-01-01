package com.methodccloopsprogram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	Palindrome p1=new Palindrome();
	System.out.println(p1.PalindromeChecker( n));
	boolean res=p1.PalindromeChecker( n);
	scan.close();
	if(res==true)
	{
		System.out.println("Number is Palindrome");
	}else
	{
		System.out.println("Number is Not Palindrome");	
	}
}
}