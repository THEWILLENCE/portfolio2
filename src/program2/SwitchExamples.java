package program2;
/*
 * Will Ence
 * 10/18
 * switch statement examples
 */

import java.util.Scanner;

public class SwitchExamples {

	public static void main(String[] args) {
		
		//import scanner
		Scanner input = new Scanner(System.in);
		//prompt the user
		System.out.println("Enter the year you were born: ");
		//declare variables
		int year = input.nextInt();
		//switch statements
		switch (year % 12) {
		case 0:
			System.out.println("monkey");
			System.out.println("Attribute: Changebility");
			break;
		case 1:
			System.out.println("rooster");
			System.out.println("Attribute: Being Constant");
			break;
		case 2:
			System.out.println("dog");
			System.out.println("Attribute: Fidelety");
			break;
		case 3: 
			System.out.println("pig");
			System.out.println("Attribute: Amiability");
			break;
		case 4:
			System.out.println("rat");
			System.out.println("Attribute: Wisdom");
			break;
		case 5:
			System.out.println("ox");
			System.out.println("Attribute: Industriosness");
			break;
		case 6:
			System.out.println("tiger");
			System.out.println("Attribute: Valor");
			break;
		case 7:
			System.out.println("rabbit");
			System.out.println("Attribute: Caution");
			break;
		case 8:
			System.out.println("dragon");
			System.out.println("Attribute: Strength");
			break;
		case 9:
			System.out.println("snake");
			System.out.println("Attribute: Flexibility");
			break;
		case 10:
			System.out.println("horse");
			System.out.println("Attribute: Forging ahead");
			break;
		case 11:
			System.out.println("sheep");
			System.out.println("Attribute: Unity");
			break;
		}
	
	
	
	}

}
