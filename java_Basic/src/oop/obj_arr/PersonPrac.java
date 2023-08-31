package oop.obj_arr;

public class PersonPrac {

	private String name;
	private int age;
	private String gender;
	
	public PersonPrac() {}

	public PersonPrac(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}
	
	public void personInforma() {
		System.out.printf("이름: %s\n나이: %d\n성별: %s\n"
					, this.name, this.age, this.gender);
	}
	
	
	
}


