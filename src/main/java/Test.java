package port;

import java.util.*;

public class Test {

	public static Vapor vapor1 = new Vapor("Titanic", 3500, "05:00");
	public static Vapor vapor2 = new Vapor("Maritim", 500, "15:10");
	public static Vapor vapor3 = new Vapor("Atlantic", 1754, "01:03");
	public static Vapor vapor4 = new Vapor("Abcdefg", 894, "10:36");
	public static Vapor vapor5 = new Vapor("X", 5000, "20:41");
	
	public static List<Vapor> vapoare = new ArrayList<Vapor>();
	public static Port port;
	
	public Test() {	
		new Frame();
	}
		
	public static void main(String[] args) {
				
		new Test();
		
		vapoare.add(vapor1);
		vapoare.add(vapor2);
		vapoare.add(vapor3);
		vapoare.add(vapor4);
		vapoare.add(vapor5);
		
		port = new Port(vapoare);

		System.out.println("inainte de sortare:-----------");
		port.print();
		
		port.sort();
		
		System.out.println("dupa sortare:-----------------");
		port.print();
		
	}

}
