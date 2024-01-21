package com.implementation.array;

import java.util.Scanner;

public class Array {

	private int arr[];
	private Scanner scan = new Scanner(System.in);
	
	public Array(int n) {
		arr = new int[n];
	}
	
	public void insert() {
		System.out.println();
		System.out.println("Enter the position from 0 to "+(arr.length-1)+" : ");
		int index = scan.nextInt();
		System.out.println("Enter the element : ");
		int element = scan.nextInt();
		arr[index] = element;
	}
	
	public void delete() {
		System.out.println();
		System.out.println("Enter the position to delete from 0 to "+(arr.length-1)+" : ");
		int index = scan.nextInt();
		System.out.println("The deleted element is '"+arr[index]+"' from position "+index);
		arr[index] = 0;
	}
	
	public void display() {
		System.out.println();
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
