package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		

		Scanner sc = new Scanner(System.in);
		
		/*
		int cnt = 0;
		int ncnt = 0;
		
		System.out.println("*** 더하기 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력하세요.");
		
		while(true) {
			
			int a = (int)(Math.random()*100 + 1);
			int b = (int)(Math.random()*100 + 1); // (0<b<1) *100 -> (0< b <100)  +1  => 1<= b <101 
			
			System.out.println(a + " + " + b + " = ???");
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == a + b) {
				System.out.println("정답입니다!");
				cnt++;
				
			}else if(answer == 0){
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다~");
				ncnt++;
			}
				
		}
		
		System.out.println("-----------------------------");
		System.out.printf("정답 횟수: %d회\n", cnt);
		System.out.printf("오답 횟수: %d회\n", ncnt);
		*/
		
		int cCount = 0;
		int iCount = 0;
		
		
		System.out.println("*** 덧셈 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			
			int rn1 = (int)(Math.random()*100 +1);
			int rn2 = (int)(Math.random()*100 +1);
			
			System.out.printf("%d + %d = ???\n", rn1, rn2);
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer ==  rn1 + rn2) {
				System.out.println("정답입니다!");
				cCount++;
			}else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			}else{
				System.out.println("틀렸습니다~");
				iCount++;
			}
				
		}
		
		System.out.println("-----------------------------------");
		System.out.println("정답 횟수: " + cCount + "회");
		System.out.println("오답 횟수: " + iCount + "회");
		
		
		
	}

}
