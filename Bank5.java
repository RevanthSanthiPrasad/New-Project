package OOPS_2;

public class Bank5 {
	//	Method over loading
	public int loanAvailability(String name) {
		return 50000;
	}
	public int loanAvailability(String name,int salary) {
		return 50000+salary;
	}
	public int loanAvailability(String name,int salary,int noOfProperties) {
		return 50000+salary*noOfProperties;
	}
	
	public static void main(String[]args) {
		Bank5 b = new Bank5();
		System.out.println("Loan "+b.loanAvailability("Revanth"));
		System.out.println("Loan "+b.loanAvailability("Revanth", 40000));
		System.out.println("Loan "+b.loanAvailability("Revanth", 40000, 5));
	}
}
