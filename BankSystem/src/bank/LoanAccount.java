package bank;

public class LoanAccount extends AccountDecorator{

	private int moneyToPay;
	
	public LoanAccount(Account account, int moneyToPay) {
		super(account);
		this.moneyToPay = moneyToPay;
	
	}

	public int getMoneyToPay() {
		return moneyToPay;
	}

}
