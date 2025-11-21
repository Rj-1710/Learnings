package com.demo.example.package1;

public class Demo3 {
	public static void main(String[] args) {
		
		Addition ad = new Addition();
		ad.setData(10,17);
		ad.compute();
		ad.display();
		ad = new Addition();
		ad.setData(15,15);
		ad.compute();
		ad.display();
		System.gc();
	}
}
