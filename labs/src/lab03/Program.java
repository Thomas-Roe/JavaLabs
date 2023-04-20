package lab03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// int myInt = getInt("Please type in your age ");
		// String myString = getString("Please type in your name ");
		// System.out.println("Your name is " + myString + " and your age is " + myInt);
		theLunchQueue();
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		var s = new Scanner(System.in);
		return s.nextInt();
	}
	public static String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public static void theLunchQueue() {
		String mainCourse = getString("What main dish would you like ?");
		int rP = getInt("How many roast potatoes do you want ");
		int bS = getInt("How many brussels sprouts do you want");
		System.out.println("Hello, your lunch is " + mainCourse + " with " + rP + " potatoes and " + bS + " sprouts!");
	}
}

