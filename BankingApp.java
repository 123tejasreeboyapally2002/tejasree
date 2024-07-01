package exception;


//Declaring  a class 
public class BankingApp {
	// Declaring a variables
	int accountId;
	int balance;

//creating constructor with parameters
	public BankingApp(int accountId, int balance) {
		super();// call the super class constructor
		this.accountId = accountId;
		this.balance = balance;
	}

//method declaring for deposit
	void deposit(int amt) {
		balance += amt;
		System.out.println("balance" + balance);
	}

//method declaring for withdraw
	void withdraw(int amt) throws InsuffientBalanceException {
		if (balance - 1000 >= amt) {
			balance -= amt;
			System.out.println("amount withdrawn");
			System.out.println("new balance" + balance);
		} else// custom Exception Declaring
			throw new InsuffientBalanceException("Insuffient balance");
	}

	public static void main(String args[]) {
		BankingApp bankingApp = new BankingApp(30921, 5000);
		bankingApp.deposit(5000);
		// declaring try block
		try {
			bankingApp.withdraw(2000);
		} // declaring catch block
		catch (InsuffientBalanceException e) {
			System.out.println("balance exceed limit");
			System.out.println(e);

		}
	}

}
