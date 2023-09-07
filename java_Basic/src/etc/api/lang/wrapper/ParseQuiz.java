package etc.api.lang.wrapper;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		/*
		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

		ex) 입력값: 9201013-1234567
		출력값: 1992년 10월 13일 31세 남자 

		입력값: 040906-4123456
		출력값: 2004년 9월 6일 19세 여자 

		입력값은 하이픈이 포함된 문자열이어야 합니다. 
		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		 */


		Scanner sc = new Scanner(System.in);
		
		String nums = "";
		String month = "";
		String date = "";
		String gender = "";
		int year = 0;
		int age = 0;
		
		while(true) {
			System.out.print("주민번호를 입력해주세요 (000000-0000000): ");
			String person = sc.nextLine();
			nums = person.replace("-", ""); // "-"을 제거하여 String타입으로 nums에 저장
			
			// nums에 문자열로 저장된 값들을 숫자로 변환하여 n1, n2에 나누어 저장
			// int타입에 숫자가 아닌 다른 타입의 값이 저장되면 예외발생
			try {
				int n1 = Integer.parseInt(nums.substring(0, 7));
				int n2 = Integer.parseInt(nums.substring(7));
			}catch(Exception e) {
				System.out.println("주민번호는 숫자로 입력해주세요!");
				continue;
			}
			// "-"을 제거한 주민번호가 13자리가 아니거나
			// "-"을 포함하지 않는 경우 다시입력
			if(person.replace("-", "").length() != 13 || !person.contains("-")) {
				System.out.println("다시 입력해주세요!");
				continue;
			}else if(!(nums.charAt(6) == '1'
					|| nums.charAt(6) == '2'
					|| nums.charAt(6) == '3'
					|| nums.charAt(6) == '4')) {
				System.out.println("다시 입력해주세요!");
				continue;
			}

			break;
		}// while(true) 끝

		// 주민번호 7번째 숫자에 따른 출생년도 구분
		// 나이 계산을 위해 parseInt를 이용하여 String타입을 int타입으로 변환
		if(nums.charAt(6) == '1' || nums.charAt(6) == '2') {
			year = 1900 + Integer.parseInt(nums.substring(0,2));				
		}else if(nums.charAt(6) == '3' || nums.charAt(6) == '4') {
			year = 2000 + Integer.parseInt(nums.substring(0,2));
		}
		// 주민번호 7번째 숫자에 따른 성별 구분
		if(nums.charAt(6) == '1' || nums.charAt(6) == '3') {
			gender = "남자";
		}else if(nums.charAt(6) == '3' || nums.charAt(6) == '4') {
			gender = "여자";
		}

		// 생년월일의 월과 일의 첫 자리에 0이 포함될 경우 0을 제거해준다.
		month = nums.substring(2, 4);
		if(nums.charAt(2) == '0') {
			month = month.replace("0", "");
		}
		date = nums.substring(4, 6);
		if(nums.charAt(2) == '0') {
			date = date.replace("0", "");
		}
		// 나이는 현재년도 - 출생년도
		age = 2023 - year;
		System.out.printf("%d년 %s월 %s일 %d세 %s"
				, year, month, date, age, gender);
	}

}


