package exercises;
import java.util.Scanner;

public class ControlFlowExercises {
	public static void main(String[] args) {
		/*
		int i = 5;
		while (i <= 15) {
			System.out.println(i);
			i++;
		}
		
		int a = 0;
		do {
			System.out.println(a);
			a = a + 2;
		} while (a <= 100);
		
		
		int b = 100;
		do {
			System.out.println(b);
			b -= 5;
		} while (b >= -10);
		
		
		long c = 2;
		do {
			System.out.println(c);
			c *= c;
		}while (c <1000000);
		
		for (int a = 2; a <= 100; a +=2) {
			System.out.println(a);

		}
		
		String out;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%5==0) {
				out = "FizzBuzz";
			} else if (i%3==0) {
				out = "Fizz";
			} else if (i%5==0) {
				out = "Buzz";
			} else {
				out = Integer.toString(i);
			}
			System.out.println(out);
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int x = sc.nextInt();
		
		System.out.println(
			"\nHere is your table!\nnumber | squared | cubed\n ------- | ------- | -------");
		for (int i = 1; i <= x; i++) {
			System.out.println(i + "     |"+ i*i + "     |" + i*i*i + "\n");
		}
		
		Scanner sc1 = new Scanner(System.in);
		do {
			String grade;
			System.out.println("Please enter a grade from 0-100: ");
			int x1 = sc1.nextInt();
			if (x1 <= 100 && x1 >= 88) {
				grade = "A";
			} else if (x1 <= 87 && x1 >= 80) {
				grade = "B";
			} else if (x1 <= 79 && x1 >= 67) {
				grade = "C";
			} else if (x1 <= 66 && x1 >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.printf("Here is your grade: %s\n", grade);
			System.out.println("Would you like to continue? Y/N: ");
			String cont = sc.next();
			if (!cont.equalsIgnoreCase("y")) {
				System.out.println("Goodbye.");

				break;
			}
		} while (true);
		sc.close();
	}

}
