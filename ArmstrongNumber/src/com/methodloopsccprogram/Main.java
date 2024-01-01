package com.methodloopsccprogram;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Armstrong p1=new Armstrong();
		int res=p1.sumOfDigits(n);
		//System.out.println(res);
		scan.close();
        
		if(n==res)
		{
			System.out.println("Given number is Armstrong number");
		}else
		{
			System.out.println("Given number is not Armstrong number");
		}

	}

}
