package com.anu;
//Bubble sort to arrange the array elements in ascending order//
public class Bubblesort {
	public static void main(String args[]) {
		int arr[] = { 3,2, 8, 7, 6, 5 };
		int i, j , temp;
		System.out.println("array elements");
		//to print array array elements//
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		//Two for loops are used to comparing array elements with index value//
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length -i- 1; j++) {
//if condition for checking condition//
				if (arr[j] > arr[j + 1]) {
					temp = arr[j ];
					arr[j] = arr[j + 1];
					arr[j+1]=temp;
					
				}	}
		}
		//printing values after sorting//
System.out.println("array of elements after sorting");
	for(i=0;i<arr.length;i++)
System.out.println(arr[i]+"");
	}
}