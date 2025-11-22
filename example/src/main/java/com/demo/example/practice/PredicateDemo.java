package com.demo.example.practice;

import java.util.function.Predicate;

import com.demo.example.package1.Read;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> IsEven = x ->(x%2==0);
		
		if(IsEven.test(Read.input.nextInt())) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
}
