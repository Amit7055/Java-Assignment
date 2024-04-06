package lab_assignments2;

class Account {

	protected String accNo;
	double bal;

	public Account(String accNo) {
		super();
		this.accNo = accNo;
		// this.bal = bal;
	}

	public void deposit(double amount) {
		bal = bal + amount;
	}

	void withdraw(double amount) {
		if (bal > amount)
			bal = bal - amount;
		else
			System.err.println("Insufficiant funds...");
	}

	void printAccount() {
		System.out.println("Account Number : " + accNo);
		System.out.println("Balance : " + bal);
	}

}

class SavingAccount extends Account {
	double interestRate;

	public SavingAccount(String accNo, double interestRate) {
		super(accNo);
		this.interestRate = interestRate;
	}

	public double addInterest() {
		double interest = bal * interestRate;
		bal = bal + interest;
		return interest;
	}

}

class LoanAccount extends Account {
	double loanAmount;

	public LoanAccount(String accNo, double loanAmount) {
		super(accNo);
		this.loanAmount = loanAmount;
	}

	public void payEMI(double emi) {
		if(bal>emi)
		{
			System.out.println("EMI paid successfully");
			loanAmount -= emi;
		}
		else
			System.err.println("Insufficiant funds...");
	}
}

class HousingLoan extends LoanAccount {
	int tenure;

	public HousingLoan(String accNo, double loanAmount, int tenure) {
		super(accNo, loanAmount);
		this.tenure = tenure;
	}

	public void extendTenure(int yr) {
		tenure += yr;
		System.out.println("Tenure extended successfully by " + yr + " year");
	}
}

public class Question9 {

	public static void main(String[] args) {
//		SavingAccount account = new SavingAccount("9854", 0.05);
//		account.printAccount();
//		account.deposit(5000);
//		account.addInterest();
//		account.printAccount();
		HousingLoan housingLoan=new HousingLoan("87654231", 50000, 10);
		housingLoan.printAccount();
		housingLoan.payEMI(5000);
		housingLoan.deposit(150000);
		housingLoan.payEMI(5000);
		housingLoan.printAccount();
		
		
	}

}
