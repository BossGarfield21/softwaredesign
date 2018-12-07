package operations;

import bank.*;

public class Payment implements Operation {
	
	private BasicAccount sender;
	private Account receiver;
	private int amount;
	
	public Payment(BasicAccount sender, Account receiver, int amount){
		
		this.amount = amount;
		this.sender = sender;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sender.pay(receiver, amount);
	}

	public Account getSender() {
		return sender;
	}

	public Account getReceiver() {
		return receiver;
	}

	public int getAmount() {
		return amount;
	}

}
