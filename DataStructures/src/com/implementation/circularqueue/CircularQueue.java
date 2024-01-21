package com.implementation.circularqueue;

import java.util.Scanner;

public class CircularQueue {

	private int circularQueue[];
	private int rear = -1;
	private int front = 0;
	private int count = 0;
	private int size;
	private Scanner scan = new Scanner(System.in);
	
	public CircularQueue(int size) {
		this.circularQueue = new int[size];
		this.size = size;
	}
	
	public void insert() {
		if(count == size) {
			System.out.println("Insertion not Possible, Circular Queue is Full");
		}else {
			System.out.println("Enter the Element:");
			int element = scan.nextInt();
			rear = (rear+1) % size;
			circularQueue[rear] = element;
			count++;
		}
	}
	
	public void delete() {
		if(count == 0) {
			System.out.println("Deletion not Possible, Circular Queue is Empty");
		}else {
			System.out.println("Deleted elememt is : "+circularQueue[front]);
			front = (front+1) % size;
			count--;
		}
	}
	
	public void display() {
		if(count == 0) {
			System.out.println("Display not Possible,Circular Queue is Empty");
		}else {
			int tempFront = front;
			for(int i=1; i<=count; i++) {
				System.out.print(circularQueue[tempFront]+" ");
				tempFront = (tempFront+1) % size;
			}
			System.out.println();
		}
	}
}
