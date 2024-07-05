package com.anu;
import java.util.Scanner;
//creating class//
public class PalindromeExample {
	public static void main(String[] args) {
		int n,r,q,rev=0,m;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n;
		  while(n>0) {
			  r=n%10;
			  rev=rev*10+r;
			  q=n/10;
			 n= q;
		  }
	if(m==rev) {
		
		System.out .println("The given number is palindrome");}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}

}
