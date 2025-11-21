package com.demo.example.package22;

public class EncapsulationDemo {
	private int a = 17;
	
		int b = 10;
		
	protected int c = 22;
	
	public int d = 23;
	
	private void f1() {
		System.out.println("It is private");
	}
	
	void f2() {
		System.out.println("It is default");
	}
	
	protected void f3() {
		System.out.println("It is protected");
	}
	
	public void f4() {
		System.out.println("It is public");
	}
}
