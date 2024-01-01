package com.methodprograms;
import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchaseamount:");
		double purchaseamount=scan.nextDouble();
		System.out.println("Enter the taxrate(in decimal form):");
		double taxrate=scan.nextDouble();
		System.out.println(calculateTotalWithTax( purchaseamount , taxrate));

	}
	public static double calculateTotalWithTax(double purchaseamount , double taxrate)
	{
		return purchaseamount + (purchaseamount * taxrate);
	}
}
