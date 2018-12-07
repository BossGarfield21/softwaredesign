package bank;

public class DepositAccount extends AccountDecorator{
	
	private float rate;

	public DepositAccount(Account account, float rate) {
		
		super(account);
		this.rate = rate;
		
	}

	public float getRate() {
		return rate;
	}
	

}
