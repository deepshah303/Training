package lti.bank;
public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	public void withdraw(double amount) {
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			txns[idx++] = new Transaction("Dr", amount, balance);	
		}
		else
			System.out.println("Insufficient funds!");
	}

	@Override
	public double getbalance() {
		return 0;
	}
}