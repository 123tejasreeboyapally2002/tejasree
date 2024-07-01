package exception;

import java.util.Scanner;

public class StudentEnrollApp {
	void enroll(int income,String status) throws Exception {
		if(income>500000)
			throw new ArithmeticException();
		else if(status.equalsIgnoreCase("no"))
			throw new Exception();
		System.out.println("Student enrolled into the Batch");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentEnrollApp student=new StudentEnrollApp();
		System.out.println("enter annual income");
		int income=sc.nextInt();
		System.out.println("Is your degree completed?:yes/no");
		String status=sc.next();
		try {
			student.enroll(income,status);
		}catch(Exception e) {
			System.out.println("you are not eligible for the enrollment");
		}
		}

}
