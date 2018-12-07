package operations;

import bank.*;

public class Deposit implements Operation {
	
	private Account account;
	private int amount;
	
	public Deposit(Account account, int amount){
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		account.deposit(amount);

	}

}
