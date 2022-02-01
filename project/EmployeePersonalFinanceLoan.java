package project;


import java.sql.Date;

public class EmployeePersonalFinanceLoan extends PersonalFinanceLoan{

	public EmployeePersonalFinanceLoan(Customer loanTaker, Customer guarantor, int maturity,
			double amount, Date lastPayment, Date givenLoanDate, Account givenLoanAccount) {
		super(loanTaker, guarantor, maturity, amount, lastPayment, givenLoanDate,
				givenLoanAccount);
	}
	
	public String toString() {// overriding the toString() method
		return "Employee Personal Finance Loan";
	}
}
