package bank;

import java.util.ArrayList;
import java.util.List;

import operations.Operation;

public class OperationHistory {
	
	/**private enum Type {
		PAYMENT, WITHDRAWL, INTEREST_CALCULATION, INTEREST_CHANGE,
		MAKE_DEPOSIT, OPEN_ACCOUNT, REPORT
	}*/
	
	private List<Operation> history;
	
	public OperationHistory() {
		history = new ArrayList<>();
		
	}
	
	public void addOperation(Operation operation){
		history.add(operation);
		
	}

}
