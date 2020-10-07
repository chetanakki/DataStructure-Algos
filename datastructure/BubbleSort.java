package com.utils.datastructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int[] arr = {0,5,-5,-4,2};
		int[] arr = {4,6,3,2,-1,9,-7};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void bubbleSort(int[] arr)
	{
		int temp = 0;
		System.out.println("Leng "+arr.length);
		for(int i=0;i<(arr.length - 1);i++)
		{
			for(int j=0;j<(arr.length - i - 1) ;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
				
			}
		}
	}
	// 6, 9,30,33,-1
	// -1, 6, 9, 30, 33
	
	// O(n2) complexity
	public static int[] bubbleSort1(int[] arr)
	{
		int temp = 0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j+1 == arr.length)
				{
					break;
				}
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
			System.out.println("After "+ i + " iteration : "+Arrays.toString(arr));
		}
		return arr;
	}
}
