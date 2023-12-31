package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {
	
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	@Override
	// Person 객체의 이름을 비교해 주는 메서드로 override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj instanceof Person) {
			Person p = (Person) obj; //Object타입을 Person타입으로 형 변황 -> name과 age를 확인 가능.
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	
	//equals를 오버라이딩 할 때는 hashCode도 함께 오버라딩을 진행해 주시는 것이 좋습니다.
	//equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
	//hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출 (gc가 실행될 때)
		// 가비지 컬렉터는 우리가 조정할 수 없어서 원하는 시점에 동작한다고 보장할 수 없다.
		System.out.println(this.name + "이(가) 주겄습니다.ㅜㅜ");
	}
	
	//객체 복사 메서드
	//Cloneable 인터페이스를 구현해서 사용해야 합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public void personInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
	}
	
	

}
