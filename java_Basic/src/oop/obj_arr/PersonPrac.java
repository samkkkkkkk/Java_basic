package oop.obj_arr;

public class PersonPrac {

	private String name;
	private int age ;
	private String gender;
	
	public PersonPrac() {}
	
	
	


	public PersonPrac(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void personInfor() {
		System.out.printf("이름: %s\n나이: %d\n성별: %s", this.name, this.age, this.gender);
	}
	
	
}


