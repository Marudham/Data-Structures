package com.implementation.stack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		
		try(
				Scanner scan = new Scanner(System.in);
			){
			System.out.println("Enter the size of stack : ");
			int size = scan.nextInt();
			Stack stack = new Stack(size);
			while(true) {
				System.out.println("	Enter 1 for push\n	Enter 2 for pop\n	Enter 3 for display\n	Enter 0 for exit\n	Enter your Choice:");
				int choice = scan.nextInt();
				switch(choice) {
				case 1 : stack.push();
				break;
				case 2 : stack.pop();
				break;
				case 3 : stack.display();
				break;
				case 0 : return;
				default : System.out.println("Invalid Choice, Let's try again.\n-----------------");
				}
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
