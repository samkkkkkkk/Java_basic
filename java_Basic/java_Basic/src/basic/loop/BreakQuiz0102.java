package basic.loop;

import java.util.Scanner;

public class BreakQuiz0102 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; //정답일 경우 횟수를 저장할 변수
		int ncnt = 0; //오답일 경우 횟수를 저장 할 변수
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력하세요.");
		
		while(true) {
			
			int a = (int)(Math.random()*100 + 1); //난수를 저장할 변수
			int b = (int)(Math.random()*100 + 1); //난수를 저장할 변수
			int c = (int)(Math.random()*2); //스위치 문에 쓰일 변수 0 또는 1
			
			int ans = 0; //실제 정답을 저장할  변수
			
			switch(c) { //c가 0일경우 +연산,  1일 경우 -연산을 진행
			case 0:
				System.out.println(a + " + " + b + " = ???");
				ans = a + b;
				break;
			case 1:
				System.out.println(a + " - " + b + " = ???");
				ans = a - b;
				break;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt(); // 답을 입력받는다.
			
			if(answer == ans){ //입력받은 answer과 실제 정답인 ans를 비교
				System.out.println("정답입니다!");
				cnt++;
			}else if(answer == 0){ // 0을 입력 받을 시 프로그램 종료
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다~");
				ncnt++;
			}
				
		}
		
		System.out.println("-----------------------------");
		System.out.printf("정답 횟수: %d회\n",cnt);
		System.out.printf("오답 횟수: %d회\n",ncnt);
		
		sc.close();
	}
}
