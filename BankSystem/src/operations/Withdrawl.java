package operations;

import bank.*;

public class Withdrawl implements Operation {
	
	private Account account;
	private int amount;
	
	public Withdrawl(Account account, int amount){
		this.account = account;
		this.amount = amount;
	}
	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		account.withdrawl(amount);
		
	}

}
