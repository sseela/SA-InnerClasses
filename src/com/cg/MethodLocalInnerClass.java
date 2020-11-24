package com.cg;

public class MethodLocalInnerClass {

}

class Outer1 {
	private static int i=0;
	private int j=0;
	public static void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	
	public void m1() {
		int k=0;
		/********************************/
		class Inner {
			int m=0;
			public void m2() {
				System.out.println(this.m);
				System.out.println(Outer1.this.j);
				System.out.println(Outer1.i);
				Outer1.this.m3();
				Outer1.m2();
			}
		}
		/********************************/
	}
	
	public void access() {
		new Outer1().m1();
	}
	
}