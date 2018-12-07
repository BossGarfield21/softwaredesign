package bank;

public interface Account {
		
	void deposit(int amount);
	
	void withdrawl(int amount);

	int getBalance();

	void setBalance(int balance);

	String getID();

	void setID(String iD);

	String getOwner();

	void setOwner(String owner) ;

	long getOpeningDate() ;

	void setOpeningDate(long openingDate);




}
