package BankAccountApp;

public class Savings extends Account {
	//List properties specifies to Savings Account
	 private int safetyDepositBoxID;
	 private int safetyDepositBoxKey;
	//Constructor to initialize Savings Account Properties
	public Savings(String name,String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountnumber = "1" + accountnumber;
		setsafetyDepositBox();
		}
	   @Override 
	  public void setRate() {
		   rate = getBaseRate() -  .25;
	    	System.out.println("Implement Rate for Savings ");
	    }
	
	private void setsafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	//List any Method specific to Savings Account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Savings Account Features "+
		          "\nsafety Deposit Box ID: "+ safetyDepositBoxID +
		          "\nsafety Deposit Box Key: "+ safetyDepositBoxKey);
	}


}
