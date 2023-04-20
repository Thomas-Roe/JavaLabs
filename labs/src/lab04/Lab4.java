package lab04;

import java.util.Scanner;

public class Lab4 {
	
	public void part1() {
		int bag = getPositiveInt("Price of a bag please?");
		int money = getPositiveInt("How much money do you have?");
		int numBag = Math.round(money / bag);
		System.out.println("If the price is £" + bag + " and you have £" + money + " then you will be able to buy " + numBag);
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		var s = new Scanner(System.in);
		return s.nextInt();

	}
	
	public static int getPositiveInt(String prompt) {
		while (true) {
			int num = getInt(prompt);
			if (num > 0) {
				return num;
			}
			System.out.println("Needs a positive number!");
		}
	}
	
}
