package com.demo.example.package22;

public abstract class ArithmeticClass2 implements ArithmeticInterface2{
	
	AdditionDTO addto;
	@Override
	public void setData(AdditionDTO addto) {
		this.addto = addto;
		
	}

//	@Override
//	public void cal() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void display() {
		System.out.println("num1 = "+addto.getNum1()+" num2 = "+addto.getNum2()+" num3= "+ addto.getNum3());
		
	}

}
