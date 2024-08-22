package collection;

import java.util.Scanner;

public class VowelsInString {
	public static void main(String args[]) {
		//declare a variable to store a string//
		String str;
		int vowelcount=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("do you want know the how many vowels in your string let us find out ");
		System.out.println("enter a String");
		str=scanner.nextLine();
		str=str.toLowerCase();
		System.out.println("string:"  +str);
		
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if( ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
			
			System.out.println(ch);
			vowelcount++;
		}
		}
		
		System.out.println("total number of vowels in a name:"+vowelcount);
		
	}
	

}
