package com.demo.example.package2;

public class Demo1 {
	public static void main(String[] args) {
	//	Add ad = new Add();
		Arithmetic ad = new Add();
		ad.setData(17,10);
		ad.cal();
		ad.display();
		
		ad = new Subtraction();
		ad.setData(10,17);
		ad.cal();
		ad.display();
	}
}
