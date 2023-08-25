package basic.arry;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums =  new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];


		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		String userNumber = "", userName = "", userdpt = "";
		int userAge = 0;

		while(true) {

			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");            
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt(); 


			if(menu == 1) {            	
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)



				other: while(true) {                 	        
					System.out.print("사번을 입력해 주세요: ");
					userNumber = sc.next();

					for(int i=0; i<userNums.length; i++) {

						if(userNumber.equals(userNums[i])) {
							System.out.println("중복");
							continue other;
						}						
					}

					userNums[count] = userNumber;	
					System.out.print("이름을 입력해 주세요: ");
					userName = sc.next();
					names[count] = userName;
					System.out.print("나이을 입력해 주세요: ");
					userAge = sc.nextInt();
					ages[count] = userAge;
					System.out.print("부서명을 입력해 주세요: ");
					userdpt = sc.next();
					departments[count] = userdpt;

					count++;
					break;
				}
				//				System.out.println(Arrays.toString(userNums));
			}else if(menu == 2) {            	
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				//				System.out.println(Arrays.toString(userNums));
				if(userNums[0] == null) {
					System.out.println("등록한 사원이 정보가 없습니다.");
				}
				for(int j=0; j<count; j++) {
					if(userNums[j] == null) break;

					System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s\n"
							,userNums[j], names[j], ages[j], departments[j]);
				}

			}else if(menu == 3) {            	
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

				System.out.println("검색하실 사번을 입력해주세요: ");
				String num = sc.next();
				for(int k=0; k<userNums.length; k++) {
					if(num.equals(userNums[k])) {
						System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s\n"
								,userNums[k], names[k], ages[k], departments[k]);
					}
				}

			}else if(menu == 4) {           	
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.

				System.out.print("검색하실 사번을 입력해주세요: ");
				String num = sc.next();

				boolean flag = false;
				outer: while(true) {
					for(int k=0; k<userNums.length; k++) {
						if(num.equals(userNums[k])) {
							System.out.print("옵션을 선택해주세요 [1. 나이변경 | 2. 부서변경 | 3.취소]");
							int n = sc.nextInt();
							switch(n) {
							case 1:
								System.out.print("나이를 입력해주세요: ");
								ages[k] = sc.nextInt();
								break;
							case 2:
								System.out.print("부서를 입력해주시요: ");
								departments[k] = sc.next();
								break;
							case 3:
								System.out.println("취소를 선택하셨습니다.");
								break;
							default:

								System.out.println("잘못 입력하셨습니다.");
								flag = true;
								continue outer;																			
							}

							flag = true;
							System.out.printf("수정된 정보입니다. 사번: %s 이름: %s 나이: %d 부서: %s\n"
									,userNums[k], names[k], ages[k], departments[k]);
						}

					}
					if(!flag) {
						System.out.println("일치하는 사번이 없습니다.");
					}
					break;
				}

			}else if(menu == 5) {           	
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				System.out.print("삭제하실 사번을 입력해주세요: ");
				String num = sc.next();
				System.out.println("정말 삭제하시겠습니까? [Y/N]");
				String agr = sc.next();

				if(agr.equals("Y")) {
					for(int k=0; k<count-1; k++) {
						userNums[k] = userNums[k+1];
						
					}
					count--;
				}

			}else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while(true)의 break다.
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}


		} // end while(true)


	} //end main

}
