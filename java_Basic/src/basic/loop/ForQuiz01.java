package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		//2~19까지의 난수를 생성해서 구구단을 출력해보자 (for)
		//19행까지 출력하세요. (for)
		
		/*
		int dan = (int)(Math.random()*18 +2);
		
		System.out.println("구구단 "+ dan + "단");
		
		for(int i = 1; i<=19; i++) {			
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		*/

		int dan = (int)(Math.random()*18 +2);
		
		System.out.println("*** 구구단 " + dan + "단 ***");
		System.out.println("=======================");
		
		for(int hang = 1; hang <= 19; hang++) {
			System.out.printf("%d x %d = %d\n" 
					, dan, hang, dan*hang);
		}
	}

}
