package com.implementation.array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Array Length ");
		int n = scan.nextInt();
		
		Array array = new Array(n);
		
		while(true) {
			System.out.println();
			System.out.println("Enter 1 ----> Inserting");
			System.out.println("Enter 2 ----> Delete");
			System.out.println("Enter 3 ----> Display");
			System.out.println("Enter any other key for Exit");
			System.out.println("Enter your Choice : ");
			String choice = scan.next();
			
			switch(choice) {
			case "1" : array.insert();
			break;
			case "2" : array.delete();
			break;
			case "3" : array.display();
			break;
			default : System.exit(0);
			}
			
		}
	}
}
