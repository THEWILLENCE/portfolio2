package program6;

import java.util.Scanner;

/*
 * Will Ence
 * 10/2/18
 * calculator using if statements
 */
public class IfCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get 2 numbers from user
		System.out.println("Please enter the first value.");
		double num1 = input.nextDouble();
		System.out.println("Please enter the second value.");
		double num2 = input.nextDouble();
		//get operator
		System.out.println("Do you want to + - * / or %?");
		String opp = input.next();
		
		
		
		double total = 0;
		
		//test input
		//do calculations
		if (opp.equals("+") ) {
			total = num1 + num2;
		}
		else if (opp.equals("-") ) {
			total = num1 - num2;
		}
		else if (opp.equals("*") ) {
			total = num1 * num2;
		}
		else if (opp.equals("/") ) {
			total = num1 / num2;
		}
		else if (opp.equals("%") ) {
			total = num1 % num2;
		}
		else {
			System.out.println("that wasn't an operator");
		}
		
		
		
		//print output
		
		System.out.println("your total was: "+ total);
		

	}

}
