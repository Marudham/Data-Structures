package com.implementation.linkedlist.doublylinkedlist;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {
		
		try(
			Scanner scan = new Scanner(System.in);	
			){
			LinkedList list = new LinkedList();
			int choice = 0, data = 0, pos = 0;
			while(true) {
				System.out.println("  1 to Insert Front");
				System.out.println("  2 to Insert Rear");
				System.out.println("  3 to Insert Position");
				System.out.println("  4 to Delete Front");
				System.out.println("  5 to Delete Rear");
				System.out.println("  6 to Delete Position");
				System.out.println("  7 to Display");
				System.out.println("  8 to Display Reverse");
				System.out.println("  0 for Exit");
				System.out.println("  Enter your Choice");
				choice = scan.nextInt();
				if(choice == 1 || choice == 2) {
					System.out.println("Enter the data:");
					data = scan.nextInt();
				}else if(choice == 3) {
					System.out.println("Enter the data:");
					data = scan.nextInt();
					System.out.println("Enter the position:");
					pos = scan.nextInt();
				}else if(choice == 6) {
					System.out.println("Enter the position:");
					pos = scan.nextInt();
				}
				switch (choice) {
				case 1: 
					list.insertFront(data);
					break;
				case 2:
					list.insertRear(data);
					break;
				case 3:
					list.insertAt(data, pos);
					break;
				case 4:
					list.deleteFront();
					break;
				case 5:
					list.deleteRear();
					break;
				case 6:
					list.deleteAt(pos);
					break;
				case 7:
					list.display();
					break;
				case 8:
					list.displayReverse();
					break;
				case 0:
					return;
				default:
					System.out.println("Invalid choice, let's try again");
				}
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Bye Bye.");
		}
	}
}
