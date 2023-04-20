package lab08;

public class Account {
	private static int id = 100000;
	private String owner;
	private double balance;

public Account(String owner, double balance) {
	++id;
	this.owner = owner;
	this.balance = balance;
}
//public Account(String owner, double balance) {
//	int id = 
//	this.owner = owner;
//	this.balance = balance;
//}
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
	System.out.println(id +"Your name is " + owner + " and your balance is £" + balance);
}
}
