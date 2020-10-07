package com.utils.datastructure;

public class GreedyAlgoCoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 29;
		int[] denominations = {1,2,5,10,20,50,100,500,1000};
		//quickSort(denominations,0,denominations.length-1);
		System.out.println(getCountOfDenominations(denominations,value));
	}
	
	private static int getCountOfDenominations(int[] denominations, int value)
	{
		int count = 0;
		while(true)
		{
			int max = findMaxLessThanValue(denominations, value);
			value = value - max;
			count ++;
			if(value == 0)
			{
				break;
			}
		}
		return count;
	}

	private static int findMaxLessThanValue(int[] denominations, int value)
	{
		int max = -1;
		for(int i=0;i<denominations.length;i++)
		{
			if(i+1 == denominations.length)
			{
				max = denominations[i];
				break;
			}
			if(value >= denominations[i]  &&   value <= denominations[i+1]) 
			{
				if(value == denominations[i+1])
				{
					max = denominations[i+1];
				}
				else
				{
					max = denominations[i];
				}
				break;
			}
		}
		if(max == -1)
		{
			max = denominations[denominations.length-1];
		}
		return max;
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = getPivot(arr, start, end);
			quickSort(arr, start, pivot - 1);
			quickSort(arr,pivot+1,end);
		}

	}

	public static int getPivot(int[] arr, int start, int end) {
		//2, 8, 0, -1, 111
		int temp = 0;
		int pivot = end; // 4
		int i = start - 1; // -1 , start = 0
		
		for (int j = start; j <= end; j++) {
			if (arr[j] <= arr[pivot]) {
				// swap i and j
				i = i + 1;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}
}
