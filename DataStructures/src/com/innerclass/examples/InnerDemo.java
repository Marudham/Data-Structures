package com.innerclass.examples;

import java.util.LinkedList;

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
		long l[] = new long[999999999];
		long l1[] = new long[999999999];
		long l2[] = new long[999999999];
		long l3[] = new long[999999999];
		long l4[] = new long[999999999];
		long l5[] = new long[999999999];
		long l6[] = new long[999999999];
		long l7[] = new long[999999999];
		long l8[] = new long[999999999];
		long l9[] = new long[999999999];
		long l0[] = new long[999999999];
		long l11[] = new long[999999999];
		long l12[] = new long[999999999];
		long l13[] = new long[999999999];
		long l14[] = new long[999999999];
		long l15[] = new long[999999999];
		long l16[] = new long[999999999];
		for(int j=0; j<l.length; j++) {
			l[j] = 999999999999999999l;
		}
		System.out.println(l);
	}
}
