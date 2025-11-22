
package com.demo.example.package3;
//Generics for Interfaces

interface Generics<T1,T2>{
	public T1 function(T2 b);
}


public class GenericDemo {
	public static void main(String[] args) {
		Generics<Integer, String> obj = (b) ->(b.length());
		System.out.println(obj.function("roshanjameer"));
		
	}
}
