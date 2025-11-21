package com.demo.example.package1;

public class Addition {
	
	int num1, num2;
	int num3;
	
	public Addition() {
		System.out.println("I am in zero argument constructor");
	}
	
	public void readData() {
		System.out.println("Enter two numbers: ");
		num1 = Read.input.nextInt();
		num2 = Read.input.nextInt();
	}
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void compute() {
		this.num3 = this.num1 + this.num2;
	}
	
	public void display() {
		System.out.println("Sum is: "+this.num3);
	}
	
	public void finalize() {
		System.out.println("I am in destructor");
	}
	
	static{
		System.out.println("This is constructor of Anonymous block");
	}
}
