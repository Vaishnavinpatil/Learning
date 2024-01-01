package com.methodccloopsprogram;

public class Palindrome{
 boolean PalindromeChecker(int n)	
{
	 int original=n;
	 int rev=0;
 while(n>0)
 {
	 int ld=n%10 ;
	  rev=(rev*10)+ld;
	 n=n/10;
 }
 if(original==rev)
 {
	return  true;
 }else
 {
	 return false;
 }

	}
}

