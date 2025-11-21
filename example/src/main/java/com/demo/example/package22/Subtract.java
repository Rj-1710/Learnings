package com.demo.example.package22;

public class Subtract extends ArithmeticClass2 {

	@Override
	public void cal() {
		if(addto.getNum1() > addto.getNum2()) {
			addto.setNum3(addto.getNum1()-addto.getNum2());
		}
		else {
			addto.setNum3(addto.getNum2()-addto.getNum1());
		}
	}

}
