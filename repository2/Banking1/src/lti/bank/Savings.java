package lti.bank;
public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
		
		// Adding opening account transaction
		txns[idx++] = new Transaction("OB", balance, balance);
	}

	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			txns[idx++] = new Transaction("Dr", amount, balance);	
		}
		else
			throw new BalanceException("Insufficient funds!");
	}

	@Override
	public double getbalance() {
		return 0;
	}
}