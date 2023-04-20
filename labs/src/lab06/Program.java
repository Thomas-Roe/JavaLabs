package lab06;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] students = {"Bob", "Dale", "Jake", "Hugo", "Tom", "Umar"};
		int[] marks = {60, 70, 80, 90, 10, 80};
		String grade = "Fail!";
		for (int i = 0, j = 0; i < students.length && j < marks.length; i++, j++) {
			System.out.print(students[i] + " got " + marks[j] + " marks which is a ");
			if (marks[j] >= 85)
				grade = "Distinction!";
			if (marks[j] < 85)
				grade = "Merit!";
			if (marks[j] < 70)
				grade = "Pass!";
			if (marks[j] < 50)
				grade = "Fail!";
			System.out.print(grade + "\n");*/
		account();
		}
	public static void account() {
		double currentMoney = 100;
		int years = 0;
		double interest = 0.05;
		while (currentMoney < 200) {
			years++;
			currentMoney = currentMoney + (currentMoney * interest);
		}
		System.out.print("It has taken " + years + " years to get £" + currentMoney);
	}
}
