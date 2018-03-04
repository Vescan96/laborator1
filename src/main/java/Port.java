package port;

import java.util.*;

public class Port {

	public List<Vapor> vapoare = new ArrayList<Vapor>();
	public String info;
	
	public Port() {}
	
	public Port(List<Vapor> vapoare) {
		this.vapoare = vapoare;
	}
	
	public void print() {
		for(Vapor v : vapoare)
			System.out.println(v.nume + " " + v.nrLocuri + " " + v.plecare);
		
		System.out.println();
	}
	
	public void sort() {
		Collections.sort(vapoare, comparator);
	}
	
	public static Comparator<Vapor> comparator = new Comparator<Vapor>() {

		@Override
		public int compare(Vapor vapor1, Vapor vapor2) {
			String v1 = vapor1.plecare;
			String v2 = vapor2.plecare;
			
			// ascendent
			return v1.compareTo(v2);
			
			// descendent
			//return v2.compareTo(v1);
		}	
	};
	
	public boolean search(String numeVapor) {
		for(Vapor v : vapoare) 
			if(v.nume.equals(numeVapor)) {
				info = v.nume + "\t" + v.nrLocuri + "\t" + v.plecare;
				
				return true;
			}
		
		return false;
	}
	
}
