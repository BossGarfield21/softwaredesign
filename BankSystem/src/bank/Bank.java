package bank;

import java.util.*;

public class Bank {

	private Map<String, Account> accounts;
	private List<OperationHistory> history;
	private String ID;


	public Bank(String ID) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		accounts = new HashMap<>();
		history = new ArrayList<>();

	}

	public String getID() {
		return ID;
	}

	public Account getAccount(String ID){
		return accounts.get(ID);
	}

	public String addAccount(int balance, String owner){
		String ID = UUID.randomUUID().toString();
		accounts.put(ID, new BasicAccount(balance, ID, owner, System.currentTimeMillis()));
		return ID;
	}

	public void addDeposit(String ID, float rate){

		accounts.put(UUID.randomUUID().toString(), new DepositAccount(accounts.get(ID), rate));
	}

	public void addDebit(String ID, int maxDebit, int debit){

		accounts.put(UUID.randomUUID().toString(), new DebitAccount(accounts.get(ID), debit, maxDebit));

	}

	public void addLoan(String ID, int moneyToPay){

		accounts.get(ID).deposit(moneyToPay);
		accounts.put(UUID.randomUUID().toString(), new LoanAccount(accounts.get(ID), moneyToPay));
	}


	public Map<String, Account> getAccounts() {
		return accounts;
	}


	public List<OperationHistory> getHistory() {
		return history;
	}

}
