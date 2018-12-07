package bank;

import operations.*;

public class BasicAccount implements Account{
	
	private int balance;
	private String ID;
	private String owner;
	private long openingDate;
	private OperationHistory history;
	
	public BasicAccount(int balance, String ID, String owner, long openingDate) {
		
		this.balance = balance;
		this.ID = ID;
		this.owner = owner;
		this.openingDate = openingDate;
		history = new OperationHistory();
		
	}
	
	public void pay(Account receiver, int amount){
		
		if(balance>=amount){
			balance-=amount;
			receiver.deposit(amount);
			history.addOperation(new Payment(this, receiver, amount));
		}
		
	}
	
	public void deposit(int amount){
		
		balance+=amount;
		history.addOperation(new Deposit(this, amount));

		
	}
	
	public void withdrawl(int amount){
		if(balance>=amount){
			balance -= amount;
			history.addOperation(new Withdrawl(this, amount));

		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(long openingDate) {
		this.openingDate = openingDate;
	}

}
