package com.implementation.linkedlist.doublylinkedlist;

public class LinkedList {

	private class Node{
		private Node previous;
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	
	public void insertRear(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.previous = temp;
		}
	}
	
	public void insertFront(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAt(int data, int pos) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			for(int i=1; i<pos; i++) {
				temp = temp.next;
			}
			newNode.previous = temp;
			newNode.next = temp.next;
			temp.next.previous = newNode;
			temp.next = newNode;
		}
	}
	
	public void deleteRear() {
		if(head == null) {
			System.out.println("Delete not possible, List is Empty");
		}else if(head.next == null){
			System.out.println("Deleted data is: "+head.data);
			head = null;
		}else{
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
			System.out.println("Delete not possible, List is Empty");
		}else if(head.next == null){
			System.out.println("Deleted data is: "+head.data);
			head = null;
		}else {
			System.out.println("Deleted data is: " + head.data);
			head = head.next;
			head.previous = null;
		}
	}
	
	public void deleteAt(int pos) {
		if(head == null) {
			System.out.println("Delete not possible, List is Empty");
		}else if(head.next == null){
			System.out.println("Deleted data is: "+head.data);
			head = null;
		}else {
			Node temp = head;
			for(int i=1; i<pos; i++) {
				temp = temp.next;
			}
			System.out.println("Deleted data is: "+temp.next.data);
			temp.next.next.previous = temp;
			temp.next = temp.next.next;
		}
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Display not possible, List is Empty");
		}else if(head.next == null){
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
	
	public void displayReverse() {
		if(head == null) {
			System.out.println("Display not possible, List is Empty");
		}else if(head.next == null){
			System.out.println(head.data);
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.previous;
			}
			System.out.println();
		}
	}
}
