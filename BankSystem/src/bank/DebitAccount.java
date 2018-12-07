package bank;

public class DebitAccount extends AccountDecorator{
	
	private int maxDebit;
	private int debit;

	public DebitAccount(Account account, int debit, int maxDebit) {
		super(account);
		this.maxDebit = maxDebit;
		this.debit = debit;
	}

	public int getMaxDebit() {
		return maxDebit;
	}

	public void setMaxDebit(int maxDebit) {
		this.maxDebit = maxDebit;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

}
