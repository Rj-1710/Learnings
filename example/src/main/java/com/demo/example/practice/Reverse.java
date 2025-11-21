package com.demo.example.practice;

public class Reverse {
	InputDTO idto = new InputDTO();
	
	public String rev() {
		return new StringBuilder(idto.getNum3()).reverse().toString();
	}
	
//	public Integer rev() {
//		return Integer.parseInt(rev(String.valueOf(idto.getNum())));
//	}
}
