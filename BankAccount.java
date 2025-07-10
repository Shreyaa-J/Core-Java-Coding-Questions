
public class BankAccount {
	String accountholdername;
	String accNo;
	double balance;
	public BankAccount(String accountholdername,String accNo,double balance) {
		this.accountholdername=accountholdername;
		this.accNo=accNo;
		this.balance=balance;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposited :"+amount);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			System.out.println("Withdraw amount :"+amount);
		}
		else {
			System.out.println("Invalid ");
		}
	}
	public void dispalyBal() {
		System.out.println("Acc holder name :"+accountholdername);
		System.out.println("Acc No :"+accNo);
		System.out.println("Acc balance :"+balance);
	}

}
