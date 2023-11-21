package exercises;
import java.util.*;
import java.lang.Math;

public class HighLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 100) + 1;
		int count = 1;
		int guess = 0;
		System.out.println("Welcome to the guessing game!\nPlease pick a number between 1 and 100: ");
		
		while (true) {
			guess = sc.nextInt();
			if (count > 20) {
				System.out.println("You ran out of tries!");
				break;
			}
			if (guess <= 100 && guess >= 1) {
				if (guess > random) {
					System.out.println("LOWER!");
					count++;
				}	
				else if (guess < random) {
					System.out.println("HIGHER!");
					count++;
				}	
				else {
					System.out.println("GOOD GUESS! It took you " + count + " tries!");
					break;
				}
			} else {
				System.out.println("Please enter a valid number.");
			} 
		}	
		System.out.println("Thanks for playing!");

	}
}
