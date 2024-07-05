package com.anu;

//sorting of array elements//
public class ArraySorting {
	public static void main(String args[]) {
		int arr[] = { 23, 43, 54, 34, 68, 98 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] >arr[j + 1]) {
					// swap array elements//
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
			
				}
			}
		}
		// printing sorting elements//
		System.out.println("sorting of array elements");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
