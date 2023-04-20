package lab08;

public class Program {

	public static void main(String[] args) {
		CurrentBankAccount a1 = new CurrentBankAccount("Alex", 100, 100);
		a1.withdraw(210);
		a1.getDetails();
		SavingsBankAccount s1 = new SavingsBankAccount("Laura", 100);
		s1.addInterest();
		s1.getDetails();
	}

	

}

