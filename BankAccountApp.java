package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();		
		
		
		
		String file = "C:\\Users\\vikas\\Downloads\\NewBankAccounts.csv";
		/*
		Checking chkacc1 = new Checking("Nana Satpute", "321456879",1500);
		
		Savings savacc1 = new Savings("Sana ChandanShive", "456657897",2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("****************");
		chkacc1.showInfo();
		System.out.println("****************");
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("Brokerage", 3000);
		*/
		// Read a CSV file then a create new account based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN= accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name+ " " + sSN + " " + accountType + " " + initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("error reading account type");
			}
		}
		//accounts.get(5).showInfo();
		for( Account acc: accounts ) {
			System.out.println("\n****************");
			acc.showInfo();
		}
	}

}

