import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account account) {
		accounts.add(account);
		
	}
	
	public void printAllData() {
		
		for(int i=0; i<accounts.size(); i++) {
			Account account = accounts.get(i);		
			account.printData();
			}
	}
	
}

