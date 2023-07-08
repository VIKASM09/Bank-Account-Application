package BankAccountApp;

public class Checking extends Account{
	//List properties specifies to Checking Account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking Account Properties 
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountnumber = "2" + accountnumber;
		setdebitCard();
		}
	@Override 
	    public void setRate() {
		    rate = getBaseRate() *  .15;
	    	System.out.println("Implement Rate for Checking ");
	    }
	
	private void setdebitCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPin = (int)(Math.random()*Math.pow(10, 4));
	}
	//List any Method specific to Checking Account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features "+
		          "\ndebit Card Number: "+ debitCardNumber +
		          "\ndebit Card Pin: "+ debitCardPin);
	}

}
