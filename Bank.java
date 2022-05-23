package assignment.week4.day1;

public class Bank implements PNB,CIBIL {
	//Create maximumLoanAmount() method
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("The maximum amount of loan in your account");
	}
	
	//Create creditScore() method
	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("The credit score in your account");
	}
	
	//Create minimumBalance() method
	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("The minimum balnce in your account");
	}
	
	//Create cibilScore() method
	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("The CIBIL score");
	}
	public static void main(String[] args) {
		Bank acc = new Bank();
		acc.creditScore();
		acc.minimumBalance();
		acc.maximumLoanAmount();
		acc.cibilScore();
		
		CIBIL obj = new Bank();
		obj.cibilScore();
		
		PNB bnk = new Bank();
		bnk.creditScore();
		bnk.maximumLoanAmount();
		bnk.minimumBalance();
	}

	

}
