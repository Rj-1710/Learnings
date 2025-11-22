package com.demo.example.package3;

import java.util.*;

public class EmployeeDemo {
	public static void main(String[] args) {
		EmployeeDTO emp1 = new EmployeeDTO();
		emp1.setId(1000);
		emp1.setName("Bob.jr");
		
		EmployeeDTO emp2 = new EmployeeDTO();
		emp2.setId(1001);
		emp2.setName("Bhaai");
		
		List<EmployeeDTO> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		
		System.out.println(emplist);
		
		for (EmployeeDTO emp : emplist) {
			System.out.println(emp);
		}
		
		emplist.forEach(EmployeeDemo :: printing);
	}
	
	public static void printing(EmployeeDTO edto) {
		System.out.println("name: "+edto.getName()+" id: "+edto.getId());
	}
}
