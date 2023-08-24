package basic.constate;

import java.util.Scanner;

public class IfQuiz0303 {

	public static void main(String[] args) {
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요: ");
		int max = sc.nextInt();
		int mid = sc.nextInt();
		int min = sc.nextInt();
		
		int tempt = 0;
		
		if(max > mid && max > min) {
			
			tempt = mid;
			mid = min;
			min = tempt;
		}else if(mid > max && mid > min) {
			tempt = max;
			max = mid;
			min = tempt;
		}
		
		
		
		
		
	}

}
