package com.utils.datastructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,3,2,-1,9,-7};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// select min or max element from array and compare it and put it in a first position of unsorted array
	public static void selectionSort(int[] arr)
	{
		for(int i=0; i< (arr.length);i++)
		{
			int min = i;
			for(int j=i+1;j<(arr.length);j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			if(min != i)
			{
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
