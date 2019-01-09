package program9;

import java.util.Scanner;
/*
 * Will Ence
 * 9/14/18
 * Mad Lib!
 */

public class MadLibs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String adjective;
		String place;
		String shadeOfGrey;
		String pluralNoun;
		String food1;
		String food2;
		
		System.out.println("Enter an adjective (one word answers only pls)");
		adjective = input.next();
		
		System.out.println("Enter a place");
		place = input.next();
		
		System.out.println("Enter a shade of grey");
		shadeOfGrey = input.next();
		
		System.out.println("Enter a plural noun");
		pluralNoun = input.next();
		
		System.out.println("Enter two foods");
		food1 = input.next();
		food2 = input.next();
		
		System.out.println("It's been a(n) " + adjective + " winter here in " 
		+ place + " for as long as we can remember, the sky has been " 
				+ shadeOfGrey + " and the ground has been covered with "
				+ pluralNoun + ". We have all been surviving on a steady diet of "
				+ food1 + " and " + food2 + ".");
		

	}

}
