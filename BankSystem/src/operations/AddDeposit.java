package operations;

import bank.Bank;

public class AddDeposit implements Operation {

	private Bank bank;
	private int rate;
	private String ID;
	
	public AddDeposit(Bank bank, int rate, String ID) {
		
		this.bank = bank;
		this.rate = rate;
		this.ID = ID;
		
	}

	@Override
	public void execute() {

		bank.addDeposit(ID, rate);
		
	}
}
