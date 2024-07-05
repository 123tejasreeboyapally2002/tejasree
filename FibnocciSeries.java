package com.anu;


import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		int num1, num2, num3, range;
		num1 = 0;
		num2 = 1;
		
		
			System.out.println("enter for range:");
		Scanner scanner = new Scanner(System.in);
		range= scanner.nextInt();
		System.out.println( num1+"  "+num2 );
		int i=0;
		while(i<=range) {
			num3=num1+num2;
			System.out.println("  "+num3);
		num1 = num2;
		num2 = num3;
		i++;
		}}}
	

