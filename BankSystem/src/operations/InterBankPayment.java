package operations;

import bank.*;

public class InterBankPayment implements Operation {

	private Account accSender, accReceiver;
	private Bank bankSender, bankReceiver;
	private int amount;
	private InterBank interBank;

	public InterBankPayment(Account accSender, Bank bankSender, Account accReceiver, 
			Bank bankReceiver, int amount, InterBank interBank) {

		this.accSender = accSender;
		this.accReceiver = accReceiver;
		this.bankSender = bankSender;
		this.bankReceiver = bankReceiver;
		this.amount = amount;
		this.interBank = interBank;
		
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		interBank.interBankPayment(accSender, bankSender, accReceiver, bankReceiver, amount);

	}

}
