package oop.string;

public class StringMetodParctice {

	public static void main(String[] args) {

		String str = "Hello java";
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String ss1 = str.substring(0, 4);
		System.out.println(ss1);
		
		String ss2 = str.substring(6);
		System.out.println(ss2);
		
		int len = str.length();
		System.out.println(len);
		
		int idx1 = str.indexOf("a");
		int idx2 = str.lastIndexOf("a");
		int idx3 = str.indexOf("java");
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		
		String str2 = "Hello WoRLd";
		String lower = str2.toLowerCase();
		String upper = str2.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		
		String name = "                   홍길동                    ";
		System.out.println(name.trim());
	}

}
