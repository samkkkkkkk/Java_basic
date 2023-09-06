package etc.api.lang.obj;

import oop.poly.car.Sonata;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());

		Person park = new Person("박영희", 24);
		Person hong = new Person("홍길동", 25);
		
		String str = new String("hello");
		System.out.println(str); // toString()이 오버라이딩 되어있기 때문에
								// 주소값이 아닌 문자가 출력된다.
		
		//객체 타입의 변수를 출력하거나 값을 얻을 때는
		//뒤에 자동으로 toString()이 붙어서 진행됩니다.
		System.out.println(park);
		System.out.println(hong);
		
		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같네요!");
		}else {
			System.out.println("이름이 다를 수도 있고, 나이가 다를수도, 둘 다 다를수도...");
		}
		
		
		//finalize는 gc가 호출되는 순서가 보장되지 않기 때문에
		//사용이 권장되지 않습니다. (deprecated)
//		hong = null;
//		park = null; 
//		System.gc(); //가비지 컬렉터를 호출. (부른다고 바로 안 올수도 있습니다.)
		
		Person kim = new Person("김복제인간", 100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: " + clonePerson);
			System.out.println("kim의 주소: " + kim.hashCode());
			System.out.println("복제된 객체 주소: " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		
	}

}