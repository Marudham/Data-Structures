package com.implementation.linkedlist.singlylinkedlist;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {
		
		try(
			Scanner scan = new Scanner(System.in);	
			){
			LinkedList list = new LinkedList();
			int choice = 0, data = 0, pos = 0;
			while(true) {
				System.out.println("  1 ---> Insert Front");
				System.out.println("  2 ---> Insert Rear");
				System.out.println("  3 ---> Insert with position");
				System.out.println("  4 ---> Delete Front");
				System.out.println("  5 ---> Delete Rear");
				System.out.println("  6 ---> Delete with position");
				System.out.println("  7 ---> Display");
				System.out.println("  0 ---> Exit");
				System.out.println("  Enter you choice:");
				choice = scan.nextInt();
				if(choice == 1 || choice == 2) {
					System.out.println("Enter the Data:");
					data = scan.nextInt();
				}else if(choice == 3) {
					System.out.println("Enter the Data:");
					data = scan.nextInt();
					System.out.println("Enter the position");
					pos = scan.nextInt();
				}else if(choice == 6) {
					System.out.println("Enter the position");
					pos = scan.nextInt();
				}
				switch(choice) {
				case 1 : list.insertFront(data);
				break;
				case 2 : list.insertRear(data);
				break;
				case 3 : list.insertAt(data, pos);
				break;
				case 4 : list.deleteFront();
				break;
				case 5 : list.deleteRear();
				break;
				case 6 : list.deleteAt(pos);
				break;
				case 7 : list.display();
				break;
				case 0 : return;
				default : System.out.println("Invalid Choice, let's try again");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Bye Bye.");
		}
		

//		LinkedList list = new LinkedList();
//		list.insertRear(10);
//		list.insertRear(20);
//		list.insertRear(30);
//		list.insertRear(40);
//		list.insertRear(50);
//		list.insertFront(9);
//		list.insertFront(5);
//		list.display();
//		list.insertAt(99, 2);
//		list.display();
//		
	}
}
