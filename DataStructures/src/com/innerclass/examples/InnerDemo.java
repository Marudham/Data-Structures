package com.innerclass.examples;

public class InnerDemo {

	public static void main(String[] args) {
		
//		LinkedList<E>
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(i.c+" "+i.d);
		o.display();
		char arr[] = {'k','o','d','n','e','s','t'};
		System.out.println(arr);
		System.out.println(arr.toString());
	}
}
