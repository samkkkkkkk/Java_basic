package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		int n = 48; // begin
		System.out.println("8의 배수");
		
		while(n <= 150) { //end
			
			if(n %8 ==0) {
//				System.out.print(n + " ");
				System.out.printf("%d ", n);
			}
			
			n++; // step		
		}
		
		System.out.println(); //단순 줄 개행을 위해
		
		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요
		System.out.println("4의 배수이면서 8의 배수는 아닌 수");
		int i = 1;
		
		while(i <= 100) {
			
			if(i%4 == 0 && i%8 != 0) {
				System.out.print(i + " ");
			}
//			if(i % 4 ==0) {
//				if(i % 8 !=0) {
//					System.out.print(i + " ");
//				}
//			}
			i++;
		}
		
		System.out.println();
		
		//1 ~ 30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int num =1; //begin
		int count = 0;
		
		while(num <= 30000) { //end
			
			if(num % 258 == 0) {
				count++;
			}
			
			num++; //step
		}
		
		System.out.println("1 ~ 30000중 258의 배수의 개수: " + count + "개");
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가며 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int j = 1;
		int cnt = 0;
		
		while(j <= 1000) {
			
			if(1000 % j == 0 ) {
				cnt++;
			}	
			j++;
		}
		
		System.out.println("1000의 약수의 개수: " + cnt + "개");
	}
	
	
	

}
