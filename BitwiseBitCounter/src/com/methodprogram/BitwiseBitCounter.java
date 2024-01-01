package com.methodprogram;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int num=scan.nextInt();
		int res=countSetBits( num);
		System.out.println("Number of set bits:"+res);
		scan.close();
	}
public static int countSetBits(int num)
{
	int count=0;
	while(num!=0)
	{
		count+=num & 1;
		num >>=1;
	}
	return count ;
}
}
