package operations;

import bank.*;

public class AddDebit implements Operation{
	
	private Bank bank;
	private int maxDebit;
	private int debit;
	private String ID;
	
	public AddDebit(Bank bank, int maxDebit, int debit, String ID) {
		
		this.bank = bank;
		this.maxDebit = maxDebit;
		this.debit = debit;
		this.ID = ID;
		
	}

	@Override
	public void execute() {

		bank.addDebit(ID, maxDebit, debit);
		
	}

}
