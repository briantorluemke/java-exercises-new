package exercises;
import java.util.*;

public class Bob {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput;
		System.out.println("Talk to Bob? Y/N");
		userInput = sc.nextLine();
		if (userInput.equalsIgnoreCase("N")) {
			System.out.println("Goodbye.");
			System.exit(1);
		}
		System.out.println("Bob here. What's up.");
		while (true) {	
			String bobResponse;
			String bobInput = sc.nextLine();
			if (bobInput.endsWith("?")) {
				bobResponse = "Sure.";
			} else if (bobInput.endsWith("!")) {
				bobResponse = "Whoa, chill out!";
			} else if (bobInput.length() == 0) {
				bobResponse = "Fine. Be that way!";
			} else {
				bobResponse = "Whatever.";
			}
			System.out.println(bobResponse);

		}
	}
}

