package com.demo.example.package22;

public class Demo1 {
	
	public static void main(String[] args) {
		AdditionDTO dto = new AdditionDTO();
		dto.setNum1(17);
		dto.setNum2(10);
		
		ArithmeticClass2 ad = new Add();
		ad.setData(dto);
		ad.cal();
		ad.display();
		
		ad = new Subtract();
		ad.setData(dto);
		ad.cal();
		ad.display();
	}
}