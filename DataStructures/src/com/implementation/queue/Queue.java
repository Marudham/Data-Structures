package com.implementation.queue;

import java.util.Scanner;

public class Queue {

	private int queue[];
	private int front = 0;
	private int rear = -1;
	private int size;
	private Scanner scan = new Scanner(System.in);
	
	public Queue(int size) {
		this.queue = new int[size];
		this.size = size;
	}
	
	public void insert() {
		if(rear == size-1) {
			System.out.println("Insertion not possible, Queue is Full");
		}else {
			System.out.println("Enter the Element:");
			int element = scan.nextInt();
			++rear;
			queue[rear] = element;
		}
	}
	
	public void delete() {
		if(rear == -1 || front > rear) {
			System.out.println("Deletion not possible, Queue is Empty");
		}else {
			System.out.println("Deleted element is : "+queue[front]);
			front++;
		}
	}
	
	public void display() {
		if(rear == -1 || front > rear) {
			System.out.println("Display not possible, Queue is Empty");
		}else {
			for(int i=front; i<=rear; i++) {
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
}
