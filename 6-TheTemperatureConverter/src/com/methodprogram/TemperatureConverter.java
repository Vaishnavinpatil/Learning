package com.methodprogram;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelcious(fahrenheit));

	}

	public double convertFahrenheitToCelcious(double fahrenheit)
	{
		return (fahrenheit-32)* 5/9;
	}
}
