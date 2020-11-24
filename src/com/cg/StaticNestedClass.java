package com.cg;


import java.util.concurrent.ExecutorService;

import com.cg.Outer2.Inner2;


public class StaticNestedClass {
	public static void main(String[] args) {
		Inner2 i = new Inner2();
		i.m4();
	}
}

class Outer2 {
	private static int i=0;
	private int j=0;
	public static void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	
	static class Inner2 {
		public void m4() {
			System.out.println(Outer2.i);
			System.out.println(new Outer2().j);
			Outer2.m2();
			new Outer2().m3();
		}
	}
	
	public void access() {
		Outer2.Inner2 i = new Outer2.Inner2();
		Inner2 i2 = new Inner2();
		i.m4();
		i2.m4();
	}
}