package com.utils.datastructure;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		//System.out.println(binarySearch(arr, 5));
		System.out.println(binarySearchRecurssion(5,arr,0,arr.length-1));
	}
	// O(logn)
	public static int binarySearch(int[] arr,int ele)
	{	
		// find position of element 4
		int i = 0;
		int high = arr.length - 1;
		int low = 0;
		int mid = 0;
		while(i< arr.length)
		{
			if(high < low)
			{
				return 0;
			}
			mid = low + ((high - low) / 2);
			
			if(arr[mid] < ele )
			{
				low = mid + 1;
			}
			if(arr[mid] > ele)
			{
				high = mid - 1;
			}
			if(arr[mid] == ele)
			{
				return mid;
			}
			i++;
		}
		
		return 0;
	}

	
	private static int binarySearchRecurssion(int n, int[] arr, int start, int end)
	{
		if(start < end)
		{
			int mid = start + (end-start) / 2 ;
			if(n > arr[mid])
			{
				return binarySearchRecurssion( n, arr,  mid+1,  end);
			}
			else if(n < arr[mid])
			{
				return binarySearchRecurssion( n, arr,  start,  mid-1);
			}
			else if(n == arr[mid])
			{
				return mid;
			}
		
		}
		return -1;
	}
}
