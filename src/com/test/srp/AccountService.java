package com.test.srp;

public class AccountService {
	
	AccountRepository accountRepository=new AccountRepository();
	NotificationService notificationService=new NotificationService();
	public void openAccount(){
		System.out.println("Fill account internal details");
		accountRepository.create();
		notificationService.sendNotification();
	}

}
