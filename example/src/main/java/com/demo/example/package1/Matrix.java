package com.demo.example.package1;

import java.util.*;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer or click enter to create 3x3 matrix:");
		String input = sc.nextLine().trim();
		int n;
		if (input.isEmpty()) {
			n=3;
		}
		else {
			n= Integer.parseInt(input);
			
		}
		int[][] arr = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] res = new int[n][n];
		
		System.out.println("1st matrix of size "+ n + " X "+ n + " is created, Enter "+n*n+ " values");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2nd matrix of size "+ n + " X "+ n + " is created, Enter "+n*n+ " values");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("2nd matrix of size "+ n + " X "+ n + " is created, Enter "+n*n+ " values");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				res[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
