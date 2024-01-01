package com.patternprogram;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
/*for(int i=5;i>=j;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(6-j);
	}
	System.out.println();
}*/