package com.cg;

public class MemberInnerClassOrNormalInnerClass {
	public static void main(String[] args) {
		new Outer().new Inner().m3();
	}
}

class Outer {
	private static int i=0;
	private int j=0;
	public void m1() {
		System.out.println("m1");
	}
	public static void m2() {
		System.out.println("m2");
	}
	/**********************************************/
	class Inner {							//only thing is we cannot declare static members inside inner class
		public void m3() {
			System.out.println(Outer.i+" "+Outer.this.j);	//we can access static and instance variables from inner class
			Outer.this.m1();	Outer.m2();					//we can access instance method also directly
		}
	}	
	/**********************************************/
	public void accessing() {
		new Inner().m3();
	}
	
	public static void access2() {
		new Outer().new Inner().m3();
	}
}
