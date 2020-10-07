package com.utils.datastructure;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] a = {10, 5, 2, 23, 45, 21, 7};
		int[] b = {6,5,12,10,9,1};
		int[] c = {0,-2,100,44,-6,22,-200,6,5,12,10,9,1};
		int[] d = {-22,10,-44,-811,6,5,12,19,9};
		mergeSort(d,0,d.length);
	}
	
	
	public static void mergeSort(int[] arr,int l, int h)
	{
		if(h>1)
		{
			int mid = (l+h)/2;
			/*
			if(arr.length % 2 == 0)
			{
				mid = (arr.length/2) -1;
			}
			else
			{
				mid = arr.length / 2;
			}
			*/
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,mid,l,h);
		}
	
	}
	
	public static void merge(int[] arr,int m, int l, int h)
	{
		int[] left = copyArray(arr,l,m);
		int[] right= copyArray(arr,m+1,h);
		int[] returnArray = new int[left.length+right.length];
		int j=0,i=0;
		for(int k=l;k<h;k++)
		{
			if(left[i] < right[i])
			{
				returnArray[k] = left[i];
				i++;
			}
			else
			{
				returnArray[k] = right[j];
				j++;
			}
		}
		System.out.println("L: "+Arrays.toString(left));
		System.out.println("R: "+Arrays.toString(right));
	}
	
	public static int[] copyArray(int[] arr, int start, int end)
	{
		int[] returnArray = new int[end-start];
		for(int i=0;i<end;i++)
		{
			returnArray[i] = arr[i];
		}
		return returnArray;
	}
	public static int[] mergeSort1(int[] arr)
	{
		int mid = 0;
		if(arr.length % 2 == 0)
		{
			mid = (arr.length/2) -1;
		}
		else
		{
			mid = arr.length / 2;
		}
		if(arr.length == 1 || arr.length == 2)
		{
			return arr;
		}
		int[] arr1 = mergeSort1(Arrays.copyOfRange(arr, 0, mid+1));
		int[] arr2 = mergeSort1(Arrays.copyOfRange(arr, mid+1, arr.length));
		int[] returnArray = merge2(arr1,arr2);
		
		return returnArray;
	}	
	
	public static int[] merge1(int[] arr1, int[] arr2)
	{
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr2: "+Arrays.toString(arr2));
		return null;
	}
	public static int[] merge2(int[] arr1, int[] arr2)
	{
		//System.out.println("arr1: "+Arrays.toString(arr1));
		//System.out.println("arr2: "+Arrays.toString(arr2));
		//[-200, -6, -2, 0, 22, 44, 100]
		//[1, 5, 6, 9, 10, 12]
		int [] temp = new int[arr1.length + arr2.length];
		int count = 0;
		int temp1 = 0;
		for(int i=0;i<arr1.length;i++)
		{
			if(i >= arr2.length)
			{
				if(arr1[i] > arr2[i-1])
				{
					temp[count] = arr1[i];
				}
				else
				{
					temp[count-1] =  arr1[i];
					temp[count] = arr2[i-1];
				}
				return temp;
			}
			if(arr1[i] > arr2[i])
			{
				if(count != 0)
				{
					if(arr2[i] < temp[count-1])
					{
						temp1 = temp[count-1];
						temp[count-1] = arr2[i];
						arr2[i] = temp1;
					}
				}
				
				temp[count] = arr2[i];
				count++;
				temp[count] = arr1[i];
				count++;
			}
			else
			{
				if(count != 0)
				{
					if(arr1[i] < temp[count-1])
					{
						temp1 = temp[count-1];
						temp[count-1] = arr1[i];
						arr1[i] = temp1;
					}
				}
				temp[count] = arr1[i];
				count++;
				temp[count] = arr2[i];	
				count++;
			}
		}
		return temp;
	}
	
}
