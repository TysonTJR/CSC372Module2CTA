package testing;

public class BankAccount {    //this class represents a bank account object
	protected static int balance;  //protected field that is a bank account balance of an int type.
	
	public BankAccount() {   //default constructor of a bank account object
		
	}
	

	
	public static void withdrawal(int withdrawalAmt) {   //method that subtracts from the balance from a int parameter
		balance = balance - withdrawalAmt;
	}
	

	public void deposit(int depositAmt) {   //method that adds to the balance from a int parameter
		balance = balance + depositAmt;
	}
	

	
}
