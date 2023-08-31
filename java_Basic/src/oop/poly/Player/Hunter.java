package oop.poly.Player;


public class Hunter extends Player {
	
	String pet;
	
	Hunter(String pet){
		super(pet);
		this.pet = "멍멍이";
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 이름: " + pet);
	}
}
