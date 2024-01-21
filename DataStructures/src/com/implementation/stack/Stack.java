package com.implementation.stack;

import java.util.Scanner;

public class Stack {

	private int[] stack;
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);
	
	public Stack(int size) {
		this.stack = new int[size];
		this.size = size;
	}

	public void push() {
		if(top == size-1) {
			System.out.println("Push not possible, Stack is Full");
		}else {
			System.out.println("Enter the Element : ");
			int element = scan.nextInt();
			++top;
			stack[top] = element;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Pop not possible, Stack is Empty");
		}else {
			System.out.println("Deleted element is : "+stack[top]);
			--top;
		}
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("Display not possible, Stack is Empty");
		}else {
			for(int i=top; i>=0; i--) {
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
}
