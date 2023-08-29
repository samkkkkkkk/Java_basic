package oop.constructor;

public class Person {
	
	String name;
	int age;
	int height;
	
	Person() {} //기본 생성자는 무조건 만들어 놓는게 좋다. 
	
	Person(String naMe, int aGe, int hEight){
		name = naMe;
		age = aGe;
		height = hEight;
	}
	

	void info() {
		System.out.println("이름: " + name + "  나이: " 
							+ age + "  키: " + height);
	}
	
	
	
}
