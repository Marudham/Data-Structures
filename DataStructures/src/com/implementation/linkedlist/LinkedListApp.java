package com.implementation.linkedlist;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {

		try(
				Scanner scan = new Scanner(System.in);	
				){
			LinkedList linkedList = new LinkedList();
			while(true) {
				System.out.println("   Enter 1 for Insert Rear\n   Enter 2 for Insert Front\n   Enter 3 for Insert Middle\n   Enter 4 for Delete Rear\n   Enter 5 for Delete Front\n   Enter 6 for Delete Middle\n   Enter 7 for Display\n   Enter 0 for Exit\n   Enter your Choice:");
				int choice = scan.nextInt();
				switch(choice) {
				case 1 :	linkedList.insertRear();
				break;
				case 2 :	linkedList.insertFront();
				break;
				case 3 :	linkedList.insertMiddle();
				break;
				case 4 :	linkedList.deleteRear();
				break;
				case 5 :	linkedList.deleteFront();
				break;
				case 6 :	linkedList.deleteMiddle();
				break;
				case 7 :	linkedList.display();
				break;
				case 0 :	return;
				default : System.out.println("Invalid Choice, Let's try again");
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
