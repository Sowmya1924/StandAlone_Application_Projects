package com.myAccount;

import java.util.Random;

public class CurrentAccount extends Account{

	
    private long accountNo;
	
	Random r=new Random();
	
	public CurrentAccount(){
		
		
	}
	
	public CurrentAccount(String accountHolderName,int accbalance ) {
		super(accountHolderName,accbalance);
		this.accountNo =r.nextLong(12345678912l);
		
	}

	@Override
	public void deposit(int amount) {
		if(amount>0) {
			int accBalance = getAccbalance();
			accBalance=accBalance+amount;
			setAccbalance(accBalance);
			System.out.println(accBalance+" amount is Deposited");
			
		}
		
	}

	@Override
	public void withdraw(int amount) {

		if(amount<=getAccbalance()) {
			
			int accBalance =getAccbalance();
			accBalance=accBalance-amount;
			setAccbalance(accBalance);
			
			System.out.println(accBalance+" amount is Withdraw");
		}
		
	}

	@Override
	public int showBalance() {
	
		return getAccbalance();
	}

	@Override
	public int calculateInterest() {
		
		return getAccbalance()*4;
	}
	
	  public void displayCurrentAccount() {
			
			System.out.println("AccountNo: "+getAccountNo());
			System.out.println("AccountHolderName:"+getAccountHolderName());
			System.out.println("AccountBalance: "+getAccbalance());
			System.out.println("Interest:"+calculateInterest());
			System.out.println("--------------------------------");
		}

	
    public CurrentAccount getAccountDetails() {
   	 return new CurrentAccount();
    }
}
