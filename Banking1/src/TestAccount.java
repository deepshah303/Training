import lti.bank.Current;

public class TestAccount {

	public static void main(String[] args) {

//		Bank sav = AccountFactory.openAccount("savings","Marco");
//
//		sav.summary();
//
//		sav.deposit(2000);
//		sav.deposit(4000);
//		sav.withdraw(3000);
//		sav.withdraw(7000);
//		
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
		curr.withdraw(3000);
		curr.withdraw(7000);
		curr.withdraw(2000);
		curr.statement();
		
	}

}
