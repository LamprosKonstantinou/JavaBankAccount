import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
 
	public static void main(String[] args) {
		
		ArrayList<Account> accounts = new ArrayList<Account>();
			
		boolean more = true;
		
	while (more) {
				String type = JOptionPane.showInputDialog("What type of account? 1: Bank Account, 2: Savings Account 3:Checking Account");
				
				
				int selection = Integer.parseInt(type);
				String name = JOptionPane.showInputDialog("Enter owner");
				String balanceText = JOptionPane.showInputDialog("Enter balance");
				
				double balance = Double.parseDouble(balanceText);
				Account account = null;
			
				
				if (selection == 1) {
					
				   account = new Account(name,balance);
				  
				}
				else if (selection == 2) {
					String rateText = JOptionPane.showInputDialog("Enter the interest rate: ");
					double rate = Double.parseDouble(rateText);
					 account = new SavingsAccount(name, balance, rate);
					 
				}
				else if (selection == 3) {
					account = new CheckingAccount(name, balance);
					
				}
				else
					System.out.println("Your selection is not valid");
				
		        
			    
		        
		        String answer = JOptionPane.showInputDialog("Another Account? (Y/N)");
			    if(answer.equalsIgnoreCase("N")) 
			    	more = false;
			    
		}
			
	for(Account account: accounts)
		account.printData(); //πολυμορφική κλήση
	}

}
