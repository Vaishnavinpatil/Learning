package com.methodprogram;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter your choice: ");
		System.out.println("Enter 1---->addition");
		System.out.println("Enter 2---->substraction");
		System.out.println("Enter 3---->multiplication");
		System.out.println("Enter 4---->division");
		int choice=scan.nextInt();
	
		switch(choice)
		{
		case 1:int addres=addition(num1,num2);
				System.out.println("Addition result is "+addres);
				break;
		case 2:int subres=substraction(num1,num2);
				System.out.println("Substraction result is "+subres);
				break;
		case 3:int mulres=multiplication(num1,num2);
				System.out.println("Multiplication result is "+mulres);
				break;
		case 4:int divres=division(num1,num2);
				System.out.println("Division result is "+divres);
				break;
		default:System.out.println("Enter correct choice");
		}
		scan.close();	
		}
		public static int addition(int num1, int num2)
		{
			return num1 + num2;
		
       }
	
		public static int substraction(int num1, int num2)
		{
			return num1 - num2;
		
		}
		 public static int multiplication(int num1, int num2)
	      {
			 return num1 * num2;
	      
	      }
	  
	    public static int division(int num1, int num2)
	    {
	    	return num1 / num2;
	    }
   
	}	

