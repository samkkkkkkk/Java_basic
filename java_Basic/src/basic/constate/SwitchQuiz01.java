package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {
	
	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해 주세요. "); //첫번째 정수 입력
		int n1 = sc.nextInt();
		System.out.print("연산자를 입력해주세요 "); // 연산자를 문자열로 받는다.
		String oper = sc.next();
		System.out.print("정수 하나를 입력해 주세요. "); //두번째 정수 입력
		int n2 = sc.nextInt();
		
		switch(oper) { // 문자열로 받은 연산자에 따라 계산 식을 다르게 입력해 준다.
		case "+":
			System.out.printf("%d %s %d = %d 입니다.\n"
					, n1, oper, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d 입니다.\n"
					, n1, oper, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d 입니다.\n"
					, n1, oper, n2, n1 * n2);
			break;
		case "/":
			System.out.printf("%d %s %d = %d 입니다.\n"
					, n1, oper, n2, n1 / n2);
			break;
		case "%":
			System.out.printf("%d %s %d = %d 입니다.\n"
					, n1, oper, n2, n1 % n2);
			break;
		default:
			System.out.println("연산자가 잘못 입력되었습니다.");
		}
		
		sc.close();
		
		
	}
}
