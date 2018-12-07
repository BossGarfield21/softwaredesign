package bank;

import java.util.*;

public class InterBank {
	
	private Map<String, Bank> banks;
	
	public InterBank() {
		// TODO Auto-generated constructor stub
		
		banks = new HashMap<>();
		
	}
	
	public void addBank(String ID){
		
		banks.put(ID, new Bank(ID));
		
	}
	
	public void interBankPayment(Account accSender, Bank bankSender, Account accReceiver, Bank bankReceiver, int amount){
		if(banks.containsValue(bankReceiver)){
			if(bankReceiver.getAccounts().values().contains(accReceiver)){
				bankReceiver.getAccounts().get(accReceiver.getID()).deposit(amount);
			}
		}
	}

}
