package com.demo.example.package2;

import com.demo.example.package1.Read;

public class Calculator {
	public static void main(String[] args) {
		
		Arithmetic arr[] = new Arithmetic[4];
		
		arr[0] = new Add();
		arr[1] = new Subtraction();
		arr[2] = new Multiplication();
		arr[3] = new Division();
		
		System.out.println(" Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division");
		int ch = Read.input.nextInt();
		System.out.println("Enter two numbers: ");
		arr[ch-1].setData(Read.input.nextInt(), Read.input.nextInt());
		arr[ch-1].cal();
		arr[ch-1].display();
	}
}
