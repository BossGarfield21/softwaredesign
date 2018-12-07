package bank;

public class AccountDecorator implements Account {
	
	protected Account account;
	
	public AccountDecorator(Account account) {
		
		this.account = account;
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		account.deposit(amount);

	}

	@Override
	public void withdrawl(int amount) {
		// TODO Auto-generated method stub
		
		account.withdrawl(amount);

	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return account.getBalance();
	}

	@Override
	public void setBalance(int balance) {
		// TODO Auto-generated method stub
		account.setBalance(balance);

	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return account.getID();
	}

	@Override
	public void setID(String iD) {
		// TODO Auto-generated method stub

		account.setID(iD);
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return account.getOwner();
	}

	@Override
	public void setOwner(String owner) {
		// TODO Auto-generated method stub

		account.setOwner(owner);
	}

	@Override
	public long getOpeningDate() {
		// TODO Auto-generated method stub
		return account.getOpeningDate();
	}

	@Override
	public void setOpeningDate(long openingDate) {
		// TODO Auto-generated method stub

		account.setOpeningDate(openingDate);
		
	}

}
