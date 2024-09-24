
public class SavingsAccount extends Account {
	
	private double interestRate;
	
	
	
	public SavingsAccount(String aName, double initialAmount, double rate ) 
	{ 
		 super(aName , initialAmount);
		interestRate = rate;
	}
	
	
	public void setInterestRate(double rate) {
		
		interestRate = rate;
	
	}
	
	public void addInterest() {
		
		double interest = balance*interestRate;
		balance = balance + interest;
		
	}
	
	public void printData() {
		System.out.println("Savings Account: ");
		super.printData();
		System.out.println(" Rate: "+ interestRate);
	}

}
