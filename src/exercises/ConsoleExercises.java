package exercises;
import java.util.Scanner;
import java.util.*;

public class ConsoleExercises {

	public static void main(String[] args) {
		double pi = 3.14159;
		
		System.out.format("The value of pi is %.5f%n", pi);
		
		
		System.out.println("Please enter a number between 1-10");
		
		Scanner scanner = new Scanner(System.in);
		
		int userInt = scanner.nextInt();
		
		System.out.println(userInt);
		
		
		System.out.println("Please print 3 words: ");
		
		String user1 = scanner.next();
		String user2 = scanner.next();
		String user3 = scanner.next();
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		scanner.nextLine();
		
		System.out.println("Please enter a sentence: ");
		
		String user4 = scanner.nextLine();
		
		System.out.println("Entered sentence: " + user4);
		
		/*
		 Calculate the perimeter and area of Codeup's classrooms.
		Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

		Use the nextLine method each time you need to get user input. In this case, we need it twice, 
		once to get the user input for the length and again to get the user input for the width. 
		Parse the resulting strings to a numeric type.

		Assume that the rooms are perfect rectangles.
		Assume that the user will enter valid numeric data for length and width.
		Display the area and perimeter of that classroom.

		The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is 
		equal to 2 times the length plus 2 times the width.
		 */
		String userLength;
		String userWidth;
		
		System.out.println("Please enter the length of Codeup's classroom: ");
		userLength = scanner.nextLine();
		
		System.out.println("Please enter the width of Codeup's classroom: ");
		userWidth = scanner.nextLine();
		
		int length = Integer.parseInt(userLength);
		int width = Integer.parseInt(userWidth);
		
		System.out.println("The area of the room is: " + (length*width) + ", and the perimeter of the room is: " + (2*length+2*width));

	}

}
