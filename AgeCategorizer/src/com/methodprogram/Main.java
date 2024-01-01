package com.methodprogram;

import java.util.Scanner;

public class Main {

	public static void categorizeAge(int age)
	{
		if(age<=12) 
		{
			System.out.println("Child");	
		}else if(age>=13 && age<=19) 
		{
			System.out.println("Teen");	
		}
		else if( age>=20  && 59>=age ) 
		{
			System.out.println("Adult");	
		}
		else if(age>=60) 
		{
			System.out.println("Senior");	
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		categorizeAge( age);
	}

}
