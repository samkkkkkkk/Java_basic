package oop.overloading;

public class Calculator {

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.

    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
	 */

	void inputData() {}

	void inputData(int a) {}

	void inputData(int a, int b) {}

	//	void inputData(int b, int a) {} (x)

	void inputData(String s) {}

	void inputData(int a, double b) {}

	void inputData(double d, int a) {} // 전달 순서가 다른 경우!

	//	void inputData(int number) {} 정수 매개값 1개를 갖는 메서드가 이미 선언됨.

	//	int inputData(int number) { 반환 유형 return 타입은 오버로딩에 영향을 미치지 못한다.
	//		
	//		return 0;
	//	}


	/*
	 - 오버라이딩 과 오버로딩의 차이
	 오버라이딩은 메서드 틀을 바꾸지 못함
	 상속받은 내용을 재 정의 하는 것
	 -----------------------
	 오버로딩은 중복선언이다.
	 선언 규칙이 있다.
	 */

	

	int calcRectArea(int a) {		
		return a * a;	
	}

	int calcRectArea(int a, int b) {	
		return a * b;
	}

	double calcRectArea(int a, int b, int h) {	
		return (a+b) * h / 2.0;
	}




}
