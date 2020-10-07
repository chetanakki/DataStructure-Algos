package com.utils.datastructure;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printFibonacciSeries(5));
	}
	
	private static int printFibonacciSeries(int n)
	{
		if(n < 1)
		{
			return -1;
		}
		else if(n == 1)
		{
			return 0;
		}
		else if(n == 2)
		{
			return 1;
		}
		return printFibonacciSeries(n-1) + printFibonacciSeries(n-2);
	}

}
