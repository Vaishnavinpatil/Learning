package com.controlconstructprogram;

import java.util.Scanner;

public class Main {

public static void identifyCharacter(char ch)

{

// your code here
	if(Character.isUpperCase(ch) && isConsonant(ch))
	{
		System.out.println("Upper-case consonant");
	}
	else if(Character.isUpperCase(ch) && isVowel(ch))
	{
		System.out.println("Upper-case vowel");
	}
	else if(Character.isLowerCase(ch) && isConsonant(ch))
	{
		System.out.println("Lower-case consonant");
	}
	else if(Character.isLowerCase(ch) && isVowel(ch))
	{
		System.out.println("Lower-case vowel");
	}
	else if(Character.isDigit(ch))
	{
		System.out.println("Digit");
	}
	else 
	{
		System.out.println("Special character");
	}
	
}
	
	
private static boolean isVowel(char ch) {
	return "aeiouAEIOU".indexOf(ch) !=-1;
}

private static boolean isConsonant(char ch) {
	return Character.isLetter(ch) && !isVowel(ch);
}
	
	
public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Character");
	char ch=scan.next().charAt(0);
     identifyCharacter(ch);
     scan.close();
}
}
