package com.utils.datastructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GreedyAlgoActivityProblem {

	public static void main(String[] args) {
		
		Map<Integer,Integer> activity = new HashMap<>();	
		activity.put(1, 4);
		activity.put(3, 3);
		activity.put(5, 4);
		activity.put(4, 1);
		activity.put(2, 9);
		int[] ar  = activity.keySet().stream().mapToInt(i->i).toArray();
		sort(ar,0,activity.size()-1);
		System.out.println(Arrays.toString(ar));
		//printActivityCount(activity, ar);
	}
	
	private static void printActivityCount(Map map, int[] arr)
	{
		
		System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
			
		}
	}
	//Using quick sort
	private static void sort(int[] array,int start, int end)
	{
		if(start<end)
		{
			int pivot = getPivot(array,start,end);
			sort(array,start,pivot-1);
			sort(array,pivot+1,end);
		}
	}
	
	private static int getPivot(int[] array,int start, int end)
	{
		int i = start -1;
		int pivot = end; 
		int temp = 0;
		for(int j=start; j<=end;j++)
		{
			if(array[j] <= array[pivot])
			{
				i = i+1;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		return i;
	}
}
