package oop.obj_arr;

public class Score {
	

	/*
	     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
	      담을 수 있는 객체를 디자인하세요.
	      
	     - 학생의 모든 정보를 한 눈에 확인할 수 있게
	      scoreInfo() 메서드를 선언해 주세요.
	      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
	      
	     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	    */
	
	private String name;
	private int lang;
	private int eng;
	private int math;
	
	public Score(String name, int lang, int eng, int math) {
		super();
		this.name = name;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		this.lang = lang;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public void scoreInfo() {
		int total = this.lang + this.eng + this.math;
		double avg = total / 3.0;
		
		System.out.printf("이름: %s\n국어: %d점  영어: %d점  수학: %d점\n"
				,this.name, this.lang, this.eng, this.math);
		System.out.printf("총점: %d점\n평균: %.2f점\n", total, avg);
	}
	
	
	
}
