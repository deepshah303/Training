package lti.bank;
public class Current extends Account {

	private double overdraft = OVERDRAFT_AMT;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		currtxns[cidx++] = new CurrentTransaction("OB", balance, balance,overdraft);
	}

	public void withdraw(double amount) {
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < 0) {
				overdraft += balance;
				balance = 0;
			}
			currtxns[cidx++] = new CurrentTransaction("Dr", amount, balance, overdraft);
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_AMT) {
			balance += overdraft - OVERDRAFT_AMT;
			overdraft = OVERDRAFT_AMT;
		}
		currtxns[cidx++] = new CurrentTransaction("Cr", amount, balance, overdraft);
	}

	@Override
	public void getBalance() {
		System.out.println("Balance: " + balance + " and Overdraft available: " + overdraft);
	}

	@Override
	public void statement() {
		System.out.println("Statement of A/C: " );
		for (int i = 0; i < cidx; i++) {
			System.out.println(currtxns[i]);
		}
	
	}

	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
