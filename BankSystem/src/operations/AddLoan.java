package operations;

import bank.Bank;

public class AddLoan implements Operation {

	private Bank bank;
	private String ID;
	private int moneyToPay;
	
	public AddLoan(Bank bank, int moneyToPay, String ID) {
		
		this.bank = bank;
		this.moneyToPay = moneyToPay;
		this.ID = ID;
		
	}

	@Override
	public void execute() {

		bank.addLoan(ID, moneyToPay);
		
	}

}
