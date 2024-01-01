package com.methodloopsccprogram;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		ArmstrongRaisedToPowerofItsDigit theArmstrong=new ArmstrongRaisedToPowerofItsDigit();
		boolean res=theArmstrong.isArmstrong(num);
		if(res==true)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is Not Armstrong");
		}
		scan.close();
	}

 }


