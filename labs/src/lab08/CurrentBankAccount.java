package lab08;

public class CurrentBankAccount extends BankAccount {
	private int overdraft;
	private double totalBalance;
	
	public CurrentBankAccount(String owner, double balance, int overdraft){
		super(owner,balance);
		this.overdraft = overdraft;
		this.totalBalance = balance + overdraft;
	}
	@Override
	public void getDetails() {
		System.out.println(this.BankAccountNum  +": Your name is " + this.owner + " and your balance is £" + this.totalBalance + " . Your Overdraft limit is " + this.overdraft);
	}
	
	public void withdraw(double amount) {
	if (amount < totalBalance) {
		balance = balance - amount;
		totalBalance = totalBalance - amount;
		System.out.println("Your new balance is £" + balance);
	}
	else {
		System.out.println("You can't withdraw that amount");
	}
}
}
