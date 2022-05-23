package assignment.week4.day1;

public class Bank1 extends SBI {
	

	@Override
	public void ITLoan() {
		// TODO Auto-generated method stub
		System.out.println("The IT loan is");
	}
	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("The bank balance is your account is");
	}
	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("The maximum loan amount in your account is");
	}
	public static void main(String[] args) {
		Bank1 bank = new Bank1();
		bank.ITLoan();
		bank.bankBalance();
		bank.maximumLoanAmount();
		
		
		SBI bak = new Bank1();
		bak.bankBalance();
		bak.maximumLoanAmount();
		bak.ITLoan();
	}
	


}
