package basic.constate;

import java.io.InputStream;
import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max=0, mid = 0, min = 0;
		
		
//		if(a > b) {
//			max = a;
//			min = b;
//			if(max < c) {
//				max = c;
//				mid = a;
//			}else if(c > b) {
//				mid = c;
//			}else {
//				mid = b;
//				min = c;
//			}
//		
//		}else {
//			max = b;
//			min = a;
//			if(max < c) {
//				max = c;
//				mid = b;
//			}else if(c >a) {
//				mid = c;
//			}else {
//				mid = a;
//				min = c;
//			}
//		}
		
		if(a>b && a>c) {
			max = a;
			mid = b > c ? b : c;
			min = b > c ? c : b;
		}
		else if(b>a && b>c) {
			max = b;
			mid = a > c ? a : c;
			min = a > c ? c : a;
		}
		else{
			max = c;
			mid = a > b ? a : b;
			min = a > b ? b : a;
		}
		
		
		System.out.println("가장 큰 값 = " + max + " " + "중간 값 = " + mid 
				+ " " + "가장 작은 값 = "+  min);
	}

	
}
