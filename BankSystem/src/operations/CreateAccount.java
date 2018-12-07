package operations;

import bank.*;

public class CreateAccount implements Operation {
	
	private Bank bank;
	private int balance;
	private String owner;
	
	public CreateAccount(Bank bank, int balance, String owner) {
		
		this.bank = bank;
		this.owner = owner;
		this.balance = balance;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		bank.addAccount(balance, owner);
	}

}
