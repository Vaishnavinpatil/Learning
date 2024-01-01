package com.loopsccprogram;

public class Pow {
	
	 int powerOfn(int num,int n)
	{
		int finalresult=1;
		for(int i=1;i<=n;i++)
		{
			finalresult=finalresult*num;
		}
		return finalresult;
	}

	 int countNumberOfDigits(int num)
		{
			int count=0;
			while(num!=0)
			{
				num=num/10;
				count++;
		    }
			return count;
	}

}
