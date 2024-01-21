package com.implementation.queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {

		try(				
				Scanner scan = new Scanner(System.in);
				){
			System.out.println("Enter the size of Queue : ");
			int size = scan.nextInt();
			Queue queue = new Queue(size);
			while(true) {
				System.out.println("   Enter 1 for Insert\n   Enter 2 for Delete\n   Enter 3 for Display\n   Enter 0 for Exit\n   Enter your Choice:");
				int choice = scan.nextInt();
				switch(choice) {
				case 1 : queue.insert();
				break;
				case 2 : queue.delete();
				break;
				case 3 : queue.display();
				break;
				case 0 : return;
				default : System.out.println("Invalid Choice, Let's try again.");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Bye Bye");
		}
	}
}
