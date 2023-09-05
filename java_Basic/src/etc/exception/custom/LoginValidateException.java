package etc.exception.custom;

public class LoginValidateException extends Exception{
	
	
	//기본생성자
	public LoginValidateException() {
		// TODO Auto-generated constructor stub
	}
	
	//커스텀 에러 메세지를 받는 생성자.
	public LoginValidateException(String massage) {
		super(massage);
	}
	
}
