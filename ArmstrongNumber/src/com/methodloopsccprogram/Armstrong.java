package com.methodloopsccprogram;

public class Armstrong {

	 int powerOfn(int ld)
	{
		int finalresult=1;
		for(int i=1;i<=3;i++)
		{
			finalresult=finalresult*ld;
		}
		return finalresult;
	}

	 int sumOfDigits(int n)
		{
		 int sum=0;
		 while(n>0)
		 {
		 	int ld=n%10;
			int res=powerOfn(ld);
		 	sum=sum+res;
		 	n=n/10;
		 }
		 return sum;
		}
}
