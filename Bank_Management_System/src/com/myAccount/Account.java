package com.myAccount;

import java.io.Serializable;
import java.util.Random;


public abstract class Account implements Serializable{
	
	private long accountNo;
	private String accountHolderName;
	private int accbalance;
	
	Random r=new Random();
	
	public Account() {
		
	}

	public Account(String accountHolderName, int accbalance) {
		
		this.accountNo=r.nextLong(12345678912l);
		this.accountHolderName = accountHolderName;
		this.accbalance = accbalance;
	}
	
	public abstract void deposit(int amount);
	
	public abstract void withdraw(int amount);
	
	public abstract int showBalance();
	
	public abstract int calculateInterest();
	
	
	
	public long getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccbalance() {
		return accbalance;
	}

	public void setAccbalance(int accbalance) {
		this.accbalance = accbalance;
	}

//	public void displayAccount() {
//		
//		System.out.println("AccountNo: "+getAccountNo());
//		System.out.println("AccountHolderName:"+getAccountHolderName());
//		System.out.println("AccountBalance: "+getAccbalance());
//		System.out.println("Interest:"+calculateInterest());
//		System.out.println("--------------------------------");
//	}
//	
	

}
