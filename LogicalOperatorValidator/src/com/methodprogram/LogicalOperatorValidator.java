package com.methodprogram;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean input1=scan.nextBoolean();
        System.out.println("Does input meet a certain condition (true/false):");
		boolean input2=scan.nextBoolean();
		isValidInput( input1 ,input2);
	    scan.close();

	}

	public static boolean isValidInput(boolean input1 ,boolean input2)
	{
		if(input1==true && input2==true)
		{
		    System.out.println("Input is Valid");
		    return true;
		}else
		{
			System.out.println("Input is Invalid");
			return false;
		}
		
	}
}
