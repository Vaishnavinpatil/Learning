package com.methodprogram;

public class Power {
	int powerOfn(int num,int n)
	{
		int finalresult=1;
		for(int i=1;i<=n;i++)
		{
			finalresult=finalresult*num;
		}
		return finalresult;
	}

}
