package com.utils.datastructure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 2, 8, 0, -1, 111 };
		int[] arr1 = {9,4,6,3,7,1,2,11,5};
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);
		System.out.println(Arrays.toString(arr));
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
