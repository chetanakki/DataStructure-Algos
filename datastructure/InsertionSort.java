package com.utils.datastructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {30,10,50,20,60,40};
		int[] arr = {0,5,-5,-4,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr)
	{
		int count = 0;
		int temp = 0;
		for(int i=1; i< arr.length;i++)
		{	
			temp = arr[i];
			count = i;
			while(count > 0 && arr[count-1] > temp)
			{
				arr[count] = arr[count-1];
				count --;
			}
			arr[count] = temp;
			
		}
		/*
		int ele = arr[i];
		for(int j=0;j<i;j++)
		{
			if(ele < arr[j])
			{
				int temp = arr[j];
				arr[j] = ele;
				ele = temp;
			}
		}
		*/
	}
}
