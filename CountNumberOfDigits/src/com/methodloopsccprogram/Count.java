package com.methodloopsccprogram;

public class Count {
	int countNumberOfDigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
			}
return count;
}
}