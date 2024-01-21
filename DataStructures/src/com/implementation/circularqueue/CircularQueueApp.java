package com.implementation.circularqueue;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {

		try(
				Scanner scan = new Scanner(System.in);
				){
			System.out.println("Enter Circular Queue Size : ");
			int size = scan.nextInt();
			CircularQueue circularQueue = new CircularQueue(size);
			while(true) {
				System.out.println("   Enter 1 for Insert\n   Enter 2 for Delete\n   Enter 3 for Display\n   Enter 0 for Exit\n   Enter your Choice:");
				int choice = scan.nextInt();
				switch(choice) {
				case 1 : circularQueue.insert();
				break;
				case 2 : circularQueue.delete();
				break;
				case 3 : circularQueue.display();
				break;
				case 0 : return;
				default : System.out.println("Invalid Choice, Let's try again.");
				}
				System.out.println();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Bye Bye");
		}

	}
}
