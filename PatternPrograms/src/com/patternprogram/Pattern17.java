package com.patternprogram;

public class Pattern17 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
		
			{
				for(int l=1;l<=i;l++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
