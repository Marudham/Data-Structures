package com.implementation.linkedlist.singlylinkedlist;

public class LinkedList {

	private Node head;
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public void insertRear(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else if(head.next  == null) {
			head.next = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void insertFront(int data) {
		if(head == null) {
			head = new Node(data);
		}else {
			head = new Node(data, head);
		}
	}
	
	public void insertAt(int data, int pos) {
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1; i<pos; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void deleteRear() {
		if(head == null) {
			System.out.println("Delete not possible, LinkedList is Empty");
		}else if(head.next == null){
			head = null;
		}else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println("Deleted data is: "+temp.next.data);
			temp.next = null;
		}
	}
	
	
	public void deleteFront() {
		if(head == null) {
			System.out.println("Delete not possible, LinkedList is Empty");
		}else {
			System.out.println("Deleted data is: "+head.data);
			head = head.next;
		}
	}
	
	
	public void deleteAt(int pos) {
		if(head == null) {
			System.out.println("Delete not possible, LinkedList is Empty");
		}else {
			Node temp = head;
			for(int i=1; i<pos; i++) {
				temp = temp.next;
			}
			System.out.println("Deleted data is: " + temp.next.data);
			temp.next = temp.next.next;
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Display not possible, LinkedList is Empty");
		}else if(head.next == null) {
			System.out.println(head.data);
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
