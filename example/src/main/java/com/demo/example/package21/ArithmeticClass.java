package com.demo.example.package21;

public abstract class ArithmeticClass implements ArithmeticInterface {
	int num1;
	int num2;
	int num3;
	
	@Override
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}

//	@Override
//	public void cal() {
//		
//		
//	}

	@Override
	public void display() {
		System.out.println("calculation of "+num1+" and "+ num2 +" is "+num3);
		
	}

}
