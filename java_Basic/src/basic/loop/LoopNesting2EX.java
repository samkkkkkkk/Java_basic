package basic.loop;

import java.util.Scanner;

public class LoopNesting2EX {
	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 이력해주세요: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		System.out.println("입력받은 수 -> " + num);
		System.out.print("소수: ");
		
		for(int i=1; i<=num; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i % j  == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.printf("%d ",i);
				count++;
			}
		}
		System.out.printf("\n소수의 개수: %d개", count);
		
		sc.close();
	}
}
