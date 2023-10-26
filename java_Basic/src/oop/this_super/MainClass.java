package oop.this_super;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
//		System.out.println("p1의 주소값: " + p1);
		p1.name = "플레이어1";
		p1.characterInfo();

		System.out.println("---------------------------");

		Player p2 = new Player("플레이어2");
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();

		System.out.println("---------------------------");

		Player p3 = new Player("플레이어3", 200);
//		System.out.println("p3의 주소값: " + p3);
		p3.characterInfo();
		
		System.out.println("---------------------------");
		p3.attack(p2);
		
		System.out.println("---------------------------");
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.characterInfo();
		
		System.out.println("---------------------------");
		Mage m1 = new Mage("법사짱짱맨");
		m1.characterInfo();
		
		System.out.println("---------------------------");
		Hunter h1 = new Hunter("냥꾼짱짱맨");
		h1.characterInfo();
		
		String s1 = "a1";
		String s2 = new String("a1");
		String s3 = new String("a1");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
	}

}
