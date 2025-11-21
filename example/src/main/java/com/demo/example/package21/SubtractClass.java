package com.demo.example.package21;

public class SubtractClass extends ArithmeticClass{

	@Override
	public void cal() {
		if(num1 > num2) {
			num3 = num1 -  num2;
		}
		else {
			num3 = num2 - num1;
		}
		
	}

}
