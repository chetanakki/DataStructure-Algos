package com.utils.datastructure;

public class FindMinimumOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMinimumOperations("table","tgable",0,0));
	}

	
	private static int findMinimumOperations(String s1, String s2, int start, int end)
	{
		if(start == s1.length())
		{
			return s2.length() - end;
		}
		if(end == s2.length())
		{
			return s1.length() - start;
		}
		if(s1.length() == s2.length())
		{
			return findMinimumOperations(s1,s2,start+1, end+1) ;
		}
		int c1= 1 + findMinimumOperations(s1,s2,start+1, end) ;// inserting
		int c2= 1 + findMinimumOperations(s1,s2,start, end+1) ;// deleting
		int c3= 1 + findMinimumOperations(s1,s2,start+1, end+1) ;// replace
		return min(c1,c2,c3);
	}
	
	private static int min(int c1,int c2, int c3)
	{
		int result = 0;
		if(c1<=c2 && c1<=c3)
		{
			result =  c1;
		}
		if(c2<=c1 && c2<=c3)
		{
			result =  c2;
		}
		if(c3<=c1 && c3<=c2)
		{
			result =  c3;
		}
		return result;
	}
}
