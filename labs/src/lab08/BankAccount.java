package lab08;

public class BankAccount {
	private static int id = 100000;
	protected int BankAccountNum;
	protected String owner;
	protected double balance;

public BankAccount(String owner, double balance) {
	this.BankAccountNum = ++id;
	this.owner = owner;
	this.balance = balance;
}



public void deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("Your new balance is £" + balance);
	}
	else {
		System.out.println("You can't deposit that amount!");
	}
}

public void withdraw(double amount) {
	if (amount < balance) {
		balance = balance - amount;
		System.out.println("Your new balance is £" + balance);
	}
	else {
		System.out.println("You can't withdraw that amount");
	}
}
public void addInterest() {
	double interest = 0.025;
	balance = balance + (balance * interest);
}
public void getDetails() {
	System.out.println(this.BankAccountNum  +": Your name is " + this.owner + " and your balance is £" + this.balance);
}
}