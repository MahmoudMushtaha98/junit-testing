package Main;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int interest = 0;
		float salary = 0, gpa = 0;
		System.out.print("****** Welcome ******\n\n");

		try {			
			System.out.print("Enter Minimum acceptable industry salary: ");
			salary = input.nextFloat();
	
			System.out.print("Enter your previous GPA out of 4.00: ");
			gpa = input.nextFloat();
			
			while(gpa < 0 || gpa > 4) {
				System.err.print("Invalid value. please try again: ");
				gpa = input.nextFloat();
			}
			
			System.out.print("Enter your programming interest level: ");
			System.out.print("\n 1. Low\n 2. Medium\n 3. High\n 4. Very high\n");
			System.out.print(" ---------------\nEnter: ");
			
			interest = input.nextInt();
			while(interest < 1 || interest > 4) {
				System.err.print("Invalid value. please try again: ");
				interest = input.nextInt();
			}
		}
		catch(Exception e){
			System.out.println("Please stick to the instruction given by the program and make sure to enter a valid data types.");
			System.err.println("Please re-run the program again!");
			System.exit(0);
		}
		
		StudentRequest req = new StudentRequest(salary, gpa, interest);
		
		RecommendationEngin engin = new RecommendationEngin();
		
		engin.recommend(req);

	}
	

}


