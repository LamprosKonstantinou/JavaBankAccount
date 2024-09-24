
public class CheckingAccount extends Account {
	
	private int transCounter;
	
	public CheckingAccount(String name, double balance) {
		super(name , balance);
		transCounter = 0;
		
	}

	public void deposit(double amount) {
		transCounter++;
		super.deposit(amount);
		
		if (transCounter > 3) {
			deductFees();
		
		}
	}
	
	public void deductFees() {
		balance -= 0.5;
		
	}
public void printData() {
		System.out.println("Checking Account: ");
		super.printData();
	}
}
