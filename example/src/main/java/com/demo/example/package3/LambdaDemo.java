package com.demo.example.package3;

@FunctionalInterface
interface IsMath{
	public int cal(int a, int b);
}

public class LambdaDemo {
	
	public static void Arithmetic(IsMath obj,int a,int b) {
		System.out.println(obj.cal(a, b));
	}
	
	
	public static void main(String[] args) {
		IsMath obj = (x,y) ->(x+y);
		
		IsMath obj1 =(x,y) ->{int z;
								if(x>y) {
									z = x-y;
								}
								else {
									z = y-x;
								}
								return z;
		};
		
		System.out.println(obj.cal(17, 10));
		System.out.println(obj1.cal(17, 10));
		Arithmetic((x,y)->(x*y),10,17);
		Arithmetic((x,y)->(x/y),10,2);
	}
}
