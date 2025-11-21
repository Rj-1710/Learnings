package com.demo.example.package22;

import com.demo.example.package1.Read;

public class Demo4 {
	public static void main(String[] args) {
		int balance = 25000;
		try {
			System.out.println("Enter amount to withdraw");
			int amount = Read.input.nextInt();
			if(amount > balance) {
				throw new InsufficientBalance();
			}
			System.out.println("Please wait, Transaction under progress");
		}
		catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
	}
}
