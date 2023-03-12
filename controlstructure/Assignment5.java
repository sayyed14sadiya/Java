package controlstructure;

public class Assignment5 {
	public static void main(String[] args) {
		int accountNumber=1001;
		int accountBalance=250000;
		int salary=40000;
		String loanType="Car";
		int loanAmountExpected=300000;
		int emisExpected=30;
		
		String s=Integer.toString(accountNumber);
		if(s.charAt(0)==1){
			System.out.println("Enter a valid Account Number");
		}
		else if(accountBalance<1000) {
			System.out.println("Account should have minimum balance of 1000$");
		}
		else if(salary>25000 && loanType=="Car") {
			if(loanAmountExpected<500000 && emisExpected<36) {
				System.out.println("You are eligible for the loan");
				System.out.println("Account Number is "+accountNumber);
				System.out.println("Loan amount that can be provided "+500000);
				System.out.println("Loan amount required is "+loanAmountExpected);
				System.out.println("No of EMIS bank provides "+36);
			}
		else if(salary>25000 && loanType=="Car") {
			if(loanAmountExpected<500000 && emisExpected<36) {
				System.out.println("You are eligible for the loan");
				System.out.println("Account Number is "+accountNumber);
				System.out.println("Loan amount that can be provided "+500000);
				System.out.println("Loan amount required is "+loanAmountExpected);
				System.out.println("No of EMIS bank provides "+36);
			}
		}
		}
	}
}