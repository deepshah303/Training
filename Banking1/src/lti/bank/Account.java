package lti.bank;


/**
 * This class represents generalized bank account
 * @author Deep Shah
 * @version1.0
 */
public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns;
	protected int idx;
	
	protected CurrentTransaction[] currtxns;
	protected int cidx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		// Instantiating transaction array for the account
		txns = new Transaction[10];
		currtxns = new CurrentTransaction[10];
		// Adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
	}

	public void summary() {
		System.out.println("A/c No: " + accNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public void getBalance() {
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transaction("Credit", amount, balance);
	}

	public abstract void withdraw(double amount);

	// public void withdraw(double amount) {
	// if (amount <= balance) {
	// balance -= amount;
	// } else {
	// System.out.println("Insufficient funds!");
	// }
	// }

	public void statement() {
		System.out.println("Statement of A/C: " + accNo);
		for (int i = 0; i < idx; i++) {
			System.out.println(txns[i]);
		}
	}
}
