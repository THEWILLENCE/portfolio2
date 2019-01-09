package program1;
import java.util.Scanner;

/*
 * Will Ence
 * 9/12/18
 * compute the are of a circle
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//constant declinations
		final double PI = 3.14159265359793284626;
		
		//step 1: enter the radius of a circle
		double radius; 
		double area = 0;
		
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble(); 
		System.out.println(radius);
		
		if (radius < 0) {
			System.out.println("you can't have a - radius");
		}
		else {
		
		//step 2: compute the area using the following formula
		//area = radius*radius*pi
		if (radius > 0) {
		area = radius*radius*PI;
		
		}
		
		//step 3: display result
		
		System.out.println("the area of your circle is:" + area);
		}
	}

}
