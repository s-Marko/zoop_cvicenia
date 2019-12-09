package cvicenia5.cvicenie5;

import cvicenia5.city.City;

public class Main {
	public static void main(String[] args) {
		Citizen cit1 = new Citizen("Samuel", 160, 160);
		Citizen cit2 = new Citizen("Simona", 150, 150);
		Citizen clone = (Citizen) cit1.clone();
		
		System.out.println(cit1);
		System.out.println(clone);
		
		
		Human humanA = new Human("Adam", 1999);
		Human humanB = new Human("Imrich", 1998);
		Human humanC = new Human("Jozef", 1997);
		
		System.out.println(City.ok);
	}
}
