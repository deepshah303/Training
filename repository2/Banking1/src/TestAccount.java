import lti.bank.AccountFactory;
import lti.bank.BalanceException;
import lti.bank.Bank;
import lti.bank.Current;

public class TestAccount {

	public static void main(String[] args) {

//		Bank sav = AccountFactory.openAccount("savings","Marco");
//
//		sav.summary();
//
//		sav.deposit(2000);
//		sav.deposit(4000);
//		try {
//			sav.withdraw(7000);
//		} catch (BalanceException e) {
//			//e.printStackTrace();  //for developers to trouble shoot
//			//System.out.println(e);  //for logging purpose to audit
//			System.out.println(e.getMessage());  // for end users
//		}
//		sav.withdraw(7000);
		
//		sav.statement();

//		cc.withdraw(4000);
//		cc.getBalance();
//
//		cc.withdraw(7000);
//		cc.getBalance();
//
//		cc.deposit(4000);
//		cc.getBalance();
//		
//		cc.withdraw(3000);
//		cc.getBalance();
//		
//		cc.deposit(1000);
//		cc.getBalance();
		
		Current curr = new Current ("Phil");
		curr.summary();
		
		curr.deposit(2000);
		curr.deposit(4000);
		try {
			curr.withdraw(3000);
		} catch (BalanceException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		try {
			curr.withdraw(7000);
		} catch (BalanceException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		try {
			curr.withdraw(2000);
		} catch (BalanceException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		curr.statement();
		
	}

}
