package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
               각 문장은 줄 개행을 포함합니다.
        4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner sc = new Scanner(System.in);

		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dtf 
		= DateTimeFormatter.ofPattern("yyyyMMdd");
		System.out.println(localDate.format(dtf));

		File file = new File("C:/Mywork/file/" + localDate.format(dtf)+ "file");
		file.mkdirs();
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;



		System.out.println("파일명을 입력해주세요: ");
		String name = sc.nextLine();

		try {
			fw = new FileWriter("C:/Mywork/file/" + localDate.format(dtf)+ "file/" + name + ".txt");
			bw = new BufferedWriter(fw);
			while(true) {
				System.out.println("내용을 입력해 주세요 (그만)이라고 하면 입력이 종료됩니다");
				String str = sc.nextLine();
				if(str.equals("그만")) {
					break;
				}
				bw.write(str + "\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("===============================");
		System.out.println("*** 파일 내용 ***");

		try {
			fr = new FileReader("C:/Mywork/file/" + localDate.format(dtf)+ "file/" + name + ".txt");
			br = new BufferedReader(fr);
			String read;
			while((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
