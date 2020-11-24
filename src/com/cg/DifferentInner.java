package com.cg;

public class DifferentInner {

}


class A {
	interface B {
		
	}
}

interface C {
	class D {
		
	}
}

class E {
	static int i=0;
	class F {
		public void m1() {
			System.out.println(i);
			m2();
			m3();
		}
	}
	public static void m2() {
		System.out.println("fff");
	}
	public void m3() {
		System.out.println("ff");
	}
}

interface G {
	interface H {
		
	}
}