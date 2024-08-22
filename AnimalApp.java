package collection;

import java.util.Scanner;

public class AnimalApp {
	public static void main(String args[]) {
		int opt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("presenting animals sounds");
		System.out.println("1.dog");
		System.out.println("2.cat");
		System.out.println("3.buffallo");
		System.out.println("4.goat");
		System.out.println("choose a option");
		opt = scanner.nextInt();
		switch (opt) {
		case 1:
			System.out.println("dog makes bow bow sound");

			break;
		case 2:
			System.out.println("cat makes meow meow sound");
			break;
		case 3:
			System.out.println("buffallo makes amba sound");
			break;
		case 4:
			System.out.println("goat makes may may sound");
			break;
		default:
			System.out.println("invalid option selected no such kind of animal");
			break;
		}

	}

}
