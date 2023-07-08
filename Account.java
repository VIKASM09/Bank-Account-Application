package BankAccountApp;

public abstract class Account implements IBaseRate {
	//List Common Properties for Savings and Checking Account
	private String name;
	private String sSN;
	private double balance;
	private static int index = 10000;
	protected String accountnumber;
	protected double rate;
	
	//Constructor to set the base properties and Initialize the account 
	public Account(String name,String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// set Account Number 
		index++;
		this.accountnumber= setAccountNumber();
		setRate();
		}
	    public abstract void setRate();
	
	    private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()* Math.pow(10,3));
		return lastTwoOfSSN+ uniqueID+ randomNumber;
	}
	    
	    public void compound(){
	    	double accruedInterest = balance * (rate/100);
	    	balance = balance + accruedInterest;
	    	System.out.println("Accrued Interest: $"+ accruedInterest);	 
	    	printBalance();	
	    }
	
	//List Common Methods - Transactions
	  public void deposit(double amount) {
		  balance = balance + amount;
		  System.out.println("Depositing $" + balance);
		  printBalance();
	  }
	  public void withdraw(double amount) {
		  balance = balance - amount;
		  System.out.println("withdrawing $" + balance);
		  printBalance();
	  }
	  public void transfer(String towhere,double amount) {
		  balance = balance - amount;
		  System.out.println("Transfering $" + balance + "to" + towhere );
		  printBalance();
	  }
	  public void printBalance() {
		  System.out.println("Your Balance is Now: " + balance);
	  }
    
	    
	    
	    
	public void showInfo() {
		System.out.println(
		"NAME: "+ name +
		"\nACCOUNT NUMBER: "+ accountnumber +
		"\nBALANCE: $"+ balance +
		"\nRATE: "+ rate +"%");
	}

}
