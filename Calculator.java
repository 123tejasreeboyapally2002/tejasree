package collection;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		
	int a,b;

		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modulo");
	int op;
	System.out.println("enter a,b  values");
	Scanner sc =new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("enter a option");
	op=sc.nextInt();
	switch(op) {
	case 1:
		System.out.println( "addition="+ (a+b));
		break;
	case 2:
		System.out.println("substraction=" +(a-b));
		break;
	case 3:
		System.out.println("multiplication=" +a*b);
		break;
	case 4:
		System.out.println("division=" +a/b);
		break;
	case 5:
		System.out.println( "modulo division=" +a%b);
		break;
		
	}
	}}	


