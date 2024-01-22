package com.implementation.linkedlist;

import java.util.Scanner;

public class LinkedList {

	class Node{
		private int data;
		private Node link;
	}
	
	private Node first;
	private int size = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void insertRear() {
		Node newNode = new Node();
		System.out.println("Enter the Element:");
		int element = scan.nextInt();
		newNode.data = element;
		newNode.link = null;
		if(first == null) {
			first = newNode;
			size = 1;
		}else {
			Node temp = first;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
			size++;
		}
	}
	
	public void insertFront() {
		Node newNode = new Node();
		System.out.println("Enter the Element:");
		int element = scan.nextInt();
		newNode.data = element;
		newNode.link = null;
		if(first == null) {
			first = newNode;
			size = 1;
		}else {
			newNode.link = first;
			first = newNode;
			size++;
		}
	}
	
	public void insertMiddle() {
		Node newNode = new Node();
		System.out.println("Enter the Element:");
		int element = scan.nextInt();
		newNode.data = element;
		newNode.link = null;
		if(first == null) {
			first = newNode;
			size++;
		}else if(first.link == null) {
			first.link = newNode;
			size++;
		}else {
			System.out.println("Enter a position to Insert from 0 to "+(size-1)+": ");
			int position = scan.nextInt();
			Node temp = first;
			int count = 0;
			while(temp != null) {
				if(count == position-1) {
					newNode.link = temp.link;
					temp.link = newNode;
					size++;
					return;
				}
				temp = temp.link;
				count++;
			}
		}
	}
	
	public void deleteRear() {
		if(first == null) {
			System.out.println("Delete not possible, LinkedList is Empty");
		}else if(first.link == null) {
			System.out.println("Deleted element is: "+first.data);
			first = null;
			size = 0;
		}else {
			Node temp = first;
			while(temp.link.link != null) {
				temp = temp.link;
			}
			System.out.println("Deleted element is: "+temp.link.data);
			temp.link = null;
			size--;
		}
	}
	
	public void deleteFront() {
		if(first == null) {
			System.out.println("Delete not possible, LinkedList is Empty");
		}else if(first.link == null) {
			System.out.println("Deleted element is: "+first.data);
			first = null;
			size = 0;
		}else {
			System.out.println("Deleted element is: "+first.data);
			first = first.link;
			size--;
		}
	}
	
	public void deleteMiddle() {
//		if(first == null) {
//			System.out.println("Delete not possible, LinkedList is Empty");
//		}else if(first.link == null) {
//			System.out.println("Deleted element is: "+first.data);
//			first = null;
//		}else {
//			System.out.println("Deleted element is: "+first.data);
//			Node temp = first.link;
//			first = temp;
//		}
	}
	
	public void display() {
		if(first == null) {
			System.out.println("Display not possible, LinkedList is Empty");
		}else {
			Node temp = first;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
		}
	}
}
