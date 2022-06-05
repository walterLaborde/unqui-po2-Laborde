package ar.edu.unq.po2.tp3;

public class ExaminarExpresiones {
	
	String a = "abc";
	String s = a;
	String t;
	
	public void print() {
		System.out.println(a); // abc
		System.out.println(s); // abc
		System.out.println(t); // null
		System.out.println(s.length()); // 3
		// System.out.println(t.length()); // java.lang.NullPointException
		System.out.println(1 + a); // 1abc
		System.out.println(a.toUpperCase()); // ABC
		System.out.println("Libertad".indexOf("r")); // 4
		System.out.println("Universidad".lastIndexOf('i')); // 7
		System.out.println("Quilmes".substring(2,4)); // il
		System.out.println((a.length() + a).startsWith("a")); // False
		System.out.println(s == a); // True
		System.out.println(a.substring(1,3).equals("bc")); // True
	}
	
	public static void main (String[] args) {
		ExaminarExpresiones eString = new ExaminarExpresiones();
		eString.print();
	}
}
