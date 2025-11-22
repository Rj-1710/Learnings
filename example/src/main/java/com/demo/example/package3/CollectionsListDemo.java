package com.demo.example.package3;

import java.util.*;

public class CollectionsListDemo {
	public static void main(String[] args) {
		
		List<Integer> l1 = new Vector<>();
		l1.add(1);
		l1.add(10);
		l1.add(17);
		l1.add(22);
		l1.add(103);
		l1.add(256);
		
		System.out.println(l1 +"...using nothing");
		for(int i=0; i<l1.size(); i++) {
			System.out.print(l1.get(i)+" ");	
		}
		System.out.println("...using index");
		
		for(Integer x: l1) {
			System.out.print(x+" ");
		}
		System.out.println("....using for each");
		
		l1.forEach((x) ->{System.out.print(x+" ");});
		System.out.println("...using consumer forEach and lambda");
		
		l1.forEach(System.out :: print);
		System.out.println("..using method refernce");
		
		l1.forEach(CollectionsListDemo :: printing);
		System.out.println("...using forEach and static method");
		
		l1.forEach(new CollectionsListDemo() :: printing1);
		System.out.println("..using instance method refernce");
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println(".......using Iterator generic");
		
		//Access only one vale
		System.out.println(l1.get(4));
		
		//Add new element
		List<Integer> l2 = new ArrayList<>(Arrays.asList(new Integer[]  {100,500,250,985,56,103,17}));
		System.out.println(l2);
		
		
		//l1.removeAll
		//l1.retainAll
		l1.addAll(l2);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.shuffle(l1);
		System.out.println(l1);

		
		
		
		
		
		
	}
	
	public static void printing(Integer x) {
		System.out.print(x+" -> "+(x*x)+" .... ");
	}
	
	
	public void printing1(Integer x) {
		System.out.print(x+" -> "+(x*x)+", "+Math.round((Math.sqrt(x)))+" ...... ");
	}
}
