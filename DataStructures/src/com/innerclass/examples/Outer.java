package com.innerclass.examples;

public class Outer {

	int a = 10;
	int b;
	
	class Inner{
		int c = 20;
		int d = 30;
	}
	
	void display() {
		Inner i = new Inner();
		System.out.println(i.c);
		System.out.println(i.d);
		System.out.println(a);
		System.out.println(b);
	}
}
