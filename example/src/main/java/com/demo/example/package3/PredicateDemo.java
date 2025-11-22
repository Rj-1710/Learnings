package com.demo.example.package3;

public class PredicateDemo {
	public static void main(String[] args) {
		Temp<Integer> ob = new Temp<Integer>();
		ob.setData(17,10);
		ob.display();
		
		Temp<String> ob1 = new Temp<String>();
		ob1.setData("Jameer","talks");
		ob1.display();
		
		Temp1<String,Integer> ob3 = new Temp1();
		ob3.setData("Roshanjameer", 1710);
		ob3.display();
		
	}
}

class Temp<T> {
	T a,b;
	public void setData(T x, T y) {
		a =x;
		b= y;
	}
	
	public void display() {
		System.out.println(a + " "+b);
	}
}

class Temp1<T1, T2> {
	T1 a;
	T2 b;
	public void setData(T1 x, T2 y) {
		a =x;
		b= y;
	}
	
	public void display() {
		System.out.println(a + " "+b);
	}
}