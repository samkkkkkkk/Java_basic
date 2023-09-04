package oop.inter.basic;

public class Prac {

	public static void main(String[] args) {
		
		System.out.println("상수: " + Inter.num);
		Inter.staticmethod();
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
		
		System.out.println("--------------------------------------");
		
		Inter it1 = new ImplClass1();
		it1.method1();
		it1.parentMethod();
		
		
		//연산자 우선순위 적용
		//괄호  참조  단항  2항  3항 대입
		((ImplClass1)it1).method2(); 
		
		//인터페이스는 다중 상속이 가능
		((Inter2)it1).method2();
		
		Inter2 it2 = new ImplClass1();
		it2.method2();
		it2.parentMethod();
		
		((Inter) it2).method1();
		
		Inter it3 = new ImplClass1();
		Inter2 it4 = new ImplClass3();
		
		ParentInter[] inters = {it1, it2, it3, it4};
		
		
	}
	
}
