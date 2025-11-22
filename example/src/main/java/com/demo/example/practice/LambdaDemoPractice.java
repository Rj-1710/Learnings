package com.demo.example.practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

interface IsMath{
	public int cal(int a, int b);
}

public class LambdaDemoPractice {
	
	public static void Arithmetic(IsMath obj, int a, int b) {
		System.out.println(obj.cal(a, b));
	}
	
	public static void main(String[] args) {
		
		IsMath obj = (x,y) ->(x+y);
		System.out.println(obj.cal(17, 10));
		
		Arithmetic((x,y)->(x- y),17,10);
	}
	
	

}
