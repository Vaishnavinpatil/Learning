package com.methodprograms;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your choice:");
        int choice=scan.nextInt();
    
        {
        	if(choice==1)
        {
        	System.out.print("Enter Temperature in celsius:");
        	double celsius=scan.nextDouble();
			double fahrenheit =celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to "+fahrenheit+"°F");
        }else if (choice==2)
        {
        	System.out.print("Enter Temperature in fahrenheit:");
        	double fahrenheit=scan.nextDouble();
			double celsius=fahrenheitToCelsius( fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to "+37.0+"°C");
        }
        }
	}

	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}

}
