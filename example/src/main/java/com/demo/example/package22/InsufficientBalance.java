package com.demo.example.package22;

public class InsufficientBalance extends Exception {
	
	public InsufficientBalance() {
		super("You can withdraw. your balance is low");
	}

}
