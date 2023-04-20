package lab08;

public class SavingsBankAccount extends BankAccount {
	private double interest;
	
	public SavingsBankAccount(String owner, double balance){
		super(owner,balance);
		this.interest = 0.025;
	}
	
	public void addInterest() {
		balance = balance + (balance * interest);
	}

}
