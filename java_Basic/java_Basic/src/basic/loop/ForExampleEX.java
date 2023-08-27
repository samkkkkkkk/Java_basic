package basic.loop;

import java.util.Scanner;

public class ForExampleEX {
	public static void main(String[] args) {
		

		//1 ~ 200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)
		
		for(int i=0; i<=200; i++) {
			if(i % 6 == 0 && i % 12 !=0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n------------------------------");
		
		//정수를 하나 입력받아서
				//입력받은 정수까지의 팩토리얼 값을 구하세요.
				//팩토리얼) 5! ->  5 x 4 x 3 x 2 x 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요: ");
		int num = sc.nextInt();
		int fac = 1;
		
		for(int i=1; i<=num; i++) {
			fac *= i;
		}
		
		System.out.printf("%d! = %d", num, fac);
	}
}
