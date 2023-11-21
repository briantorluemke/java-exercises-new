package exercises;
import  java.util.*;

public class MethodsExercises {
	public static int Addition(int x, int y) {
		return x+y;
	}
	
	public static int Subtraction (int x, int y) {
		return x-y;
	}
	
	public static int Multiplication(int x, int y) {
		int result = 0;
		for (int i = 0; i < y; i++) {
			result = result + x;
		}
		return result;
	}
	
	public static int Division(int x, int y) {
		return x/y;
	}
	
	public static int Modulus(int x, int y) {
		return x%y;
	}
	
	public static void changeString(String s) {
	    s = "Wub a lub a dub dub";
	}
	
	public static int getInteger(int min, int max) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between " + min + " and " + max + ":");
		int userInput = sc.nextInt();
		
		if (userInput < min || userInput > max) {
			System.out.println("Invalid. Pleasae use the specified numbers of " + min + " and " + max + ".");
			return getInteger(min, max);
		}
		else return userInput;
	}
	
	public static int getFactorial(int x) {
		String mult = "! = 1 ";
		int start = 1;
		System.out.println("1"+ mult);

		for (int i = 2; i <= x; i++) {
			start = start*i;
			mult = mult + "x " + i + " ";
			System.out.println(i + mult + " = " + start);
		}
		return start;
	}
	
	public static void dice() {
		Scanner sc = new Scanner(System.in);
		char cont;
		
		do {
			System.out.println("Please enter the number of sides you'd like on each die: ");
			int sides = sc.nextInt();
		
			int random1 = (int) (Math.random() * sides) + 1;
			int random2 = (int) (Math.random() * sides) + 1;
		
			System.out.println("Rolling two " + sides + " faced die...");
			System.out.println("Dice one landed on: " + random1);
			System.out.println("Dice two landed on: " + random2);
			System.out.println("Would you like to continue rolling? Y/N");
			cont = sc.next().charAt(0);
		} while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye.");

	}	
	
	public static void main(String[] args) {
		System.out.println(Addition(1,2));
		System.out.println(Subtraction(4,1));
		System.out.println(Multiplication(5,8));
		System.out.println(Division(6,2));
		System.out.println(Modulus(59,17));
		String changeMe = "hello codeup!";
		changeString(changeMe);
		System.out.println(changeMe);
		int result = getInteger(1,10);
		System.out.println("Result: " + result);
		getFactorial(result);
		dice();
	}


}
