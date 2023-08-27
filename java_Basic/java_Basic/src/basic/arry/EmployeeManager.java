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
//			System.out.println(Arrays.toString(names)); // 배열값 찍어보기
//			System.out.println(count);	//count변화 확인해보기

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



				outer: while(true) {    	        
					System.out.print("사번을 입력해 주세요: ");
					userNumber = sc.next();

					for(int i=0; i<userNums.length; i++) {

						if(userNumber.equals(userNums[i])) { //입력받은 사번과 중복된 사번이 있을 시 
							System.out.println("중복");		//while(true)로 continue
							continue outer;
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

					count++; //입력받능 데이터가 저장이 되면 count를 중가시킨다.
					break;
				}
				//				System.out.println(Arrays.toString(userNums));
			}else if(menu == 2) {            	
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				//				System.out.println(Arrays.toString(userNums));
				if(count == 0) { // count가 0이면 배열에 저장된 값이 없으므로
					System.out.println("등록된 사원 정보가 없습니다.");
				}
				for(int j=0; j<count; j++) { //저장된 배열의 마지막 번호인 count까지 수행
					if(j == count) break;

					System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s\n"
							,userNums[j], names[j], ages[j], departments[j]);
				}

			}else if(menu == 3) {            	
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				
				if(count == 0) { // count가 0이면 배열에 저장된 값이 없으므로
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				}
				boolean flag = false; //일치하는 사번이 여부 확인을 위한 변수
				System.out.println("검색하실 사번을 입력해주세요: ");
				String num = sc.next();
				for(int k=0; k<count; k++) { 
					if(num.equals(userNums[k])) { //검색한 사번과 일치한 사번이 있을 경우만 실행
						System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s\n"
								,userNums[k], names[k], ages[k], departments[k]);
						flag = true;
					}

				}
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}


			}else if(menu == 4) {           	
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				
				if(count == 0) { // count가 0이면 배열에 저장된 값이 없으므로
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				}
				
				int k=0;
				System.out.print("검색하실 사번을 입력해주세요: ");
				String num = sc.next();

				boolean flag = false;
				for(k=0; k<count; k++) {
					if(num.equals(userNums[k])) {
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("일치하는 사번이 없습니다.");
					continue;
				}
				
				outer: while(true) { //일치하는 사번이 존재할 경우 수행	
					
							System.out.print("옵션을 선택해주세요 [1. 나이변경 | 2. 부서변경 | 3.취소]");
							int n = sc.nextInt();
							switch(n) {
							case 1:
								System.out.print("나이를 입력해주세요: ");
								ages[k] = sc.nextInt();
								flag = false; //나이를 수정했을경우 flag = true
								break;
							case 2:
								System.out.print("부서를 입력해주시요: ");
								departments[k] = sc.next();
								flag = false; //부서를 수정했을 경우 flag = true
								break;
							case 3:
								System.out.println("취소를 선택하셨습니다.");
								break;
							default:

								System.out.println("잘못 입력하셨습니다.");
								continue outer;	// 1,2,3중에 없을경우 while(true)를 다시실행																
							}
							if(!flag) { // 나이를 수정했거나 부서를 수정했을 경우
								System.out.printf("수정된 정보입니다. 사번: %s 이름: %s 나이: %d 부서: %s\n"
										,userNums[k], names[k], ages[k], departments[k]);
							}
					break; //while(true)를 빠져나간다.
				}
				
				

//				outer: while(true) {
//					for(int k=0; k<count; k++) {
//						if(num.equals(userNums[k])) { //일치하는 사번이 존재할 경우 수행
//							System.out.print("옵션을 선택해주세요 [1. 나이변경 | 2. 부서변경 | 3.취소]");
//							int n = sc.nextInt();
//							switch(n) {
//							case 1:
//								System.out.print("나이를 입력해주세요: ");
//								ages[k] = sc.nextInt();
//								flag = true; //나이를 수정했을경우 flag=true
//								break;
//							case 2:
//								System.out.print("부서를 입력해주시요: ");
//								departments[k] = sc.next();
//								flag = true; //부서를 수정했을 경우 flag = true
//								break;
//							case 3:
//								System.out.println("취소를 선택하셨습니다.");
//								break;
//							default:
//
//								System.out.println("잘못 입력하셨습니다.");
//								continue outer;	// 1,2,3중에 없을경우 while(true)를 다시실행																
//							}
//							if(flag) { // 나이를 수정했거나 부서를 수정했을 경우
//								System.out.printf("수정된 정보입니다. 사번: %s 이름: %s 나이: %d 부서: %s\n"
//										,userNums[k], names[k], ages[k], departments[k]);
//							}
//							flag =true; // 취소를 선택했을 경우 flag를 true로 만들어 주기 위함
//						}
//
//					}
//					if(!flag) { // 일치하는 사번이 없을 경우 여전히 flag는 false
//						System.out.println("일치하는 사번이 없습니다.");
//					}
//					break; //while(true)를 빠져나간다.
//				}

			}else if(menu == 5) {           	
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				}
				int i=0;
				boolean flag = false; //사번이 없을 경우를 판별하기 위함
				
				System.out.print("삭제하실 사번을 입력해주세요: ");
				String num = sc.next();
				
				for(i=0; i<count; i++) { 
					if(num.equals(userNums[i])) {	
						flag = true; // 일치하는 사번이 있을경우 
						break;
					}
				}
				if(!flag) { //일치하는 사번이 없는경우 여전히 flag는 false
					System.out.println("일치하는 사번이 없습니다.");
					continue;
				}
				
				System.out.println("정말 삭제하시겠습니까? [Y/N]");
				String agr = sc.next();
				
				while(true) {
					if(!agr.equals("Y") && !agr.equals("N")) { //입력받은 값이 "Y" 또는 "N"이 아닐경우
						System.out.println("잘못입력하셨습니다.");
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						agr = sc.next();
						continue;
					}
					break;
				} // while(true)의 끝
				if(agr.equals("Y")) {
							for(int j=i; j<count-1; j++) { 		//일치하는 값이 있을 경우 k번째 배열부터 count-1번째 배열까지
								userNums[j] = userNums[j+1];	//k+1번째 배열을 k번째 배열에 저장한다.		
								names[j] = names[j+1];
								ages[j] = ages[j+1];
								departments[j] = departments[j+1];
							}
							userNums[count-1] = null;	// 삭제후 count번째 배열에 null값으로 초기화	
							names[count-1] = null;
							ages[count-1] = 0;
							departments[count-1] = null;
							
							count--;
				}

				/*
				if(agr.equals("Y")) {
					for(int k=0; k<count; k++) { //k가 count까지 증가하며 num에 입력받은 값과 일치하는 값이 있는지 찾는다.
						if(num.equals(userNums[k])) {
							for(int j=k; j<count-1; j++) { 		//일치하는 값이 있을 경우 k번째 배열부터 count-1번째 배열까지
								userNums[j] = userNums[j+1];	//k+1번째 배열을 k번째 배열에 저장한다.		
								names[j] = names[j+1];
								ages[j] = ages[j+1];
								departments[j] = departments[j+1];
							}

							userNums[count-1] = null;	// 삭제후 count번째 배열에 null값으로 초기화	
							names[count-1] = null;
							ages[count-1] = 0;
							departments[count-1] = null;

							flag = true;
						}
					}
					if(!flag) { //if(num.equals(userNums[k]))이 수행되지 않았을 경우 flag는 여전히 false
						System.out.println("없는 사번입니다.");
					}else { //flag가 true일 경우 수행
						count--; 
					}
				}*/

			}else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; //while(true)의 break다.
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}


		} // end while(true)

		sc.close();
	} //end main

}
