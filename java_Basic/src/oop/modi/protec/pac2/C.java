package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{ 
	
//	A a1 = new A(30); (x)protected
//	A a2 = new A(5.67); (x)default
	
	public C() {
		
		/*
		 - protected 제한자는 패키지가 다른 경우
		  두 클래스 사이에 상속 관게가 없다면
		  super 키워드를 통해 참조를 허용합니다.
		 */
		
		super(30);
//		super(5.67); (x) default
		super.x = 1; // protected
//		super.y = 2; (x) default
		super.method1();// protected
//		super.method2();//(x) default
		
	}
	
}