import bank.*;
import operations.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank("B1");
		String ID = b1.addAccount(100, "Hugo");
		b1.addDebit(ID, -100, 0);


		for( Account d1: b1.getAccounts().values()){
			Operation with = new Withdrawl(d1, 20);
			with.execute();
			System.out.println("Conta" + d1.getOwner() + d1.getBalance());
			System.out.println(d1.getBalance());
		}


		System.out.println(b1.getAccount(ID).getBalance());

	}

}
