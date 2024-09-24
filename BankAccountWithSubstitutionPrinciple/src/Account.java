
public class Account {
protected double balance;
protected String name;

public Account() {
	
}

public Account(String name , double amount) {
	balance = amount;
	this.name = name;
}

public double getBalance() {
	return balance;
}

public void deposit(double amount) {
	balance += amount;
	
}

public void printData() {
	
	System.out.println("Balance: " + balance);;
	System.out.println("Name: "+ name);
}
}
