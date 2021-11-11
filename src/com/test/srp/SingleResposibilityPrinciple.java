package com.test.srp;

//Class should have one and only one reason to change
public class SingleResposibilityPrinciple {

	public static void main(String[] args) {
		 AccountService accountService=new AccountService();
		 accountService.openAccount();
	}

}
