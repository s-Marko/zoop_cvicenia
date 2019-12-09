package cvicenia3;


public class Main {	
	
	public static void main(String[] args) {
		Calculate.calculate();
		
		FromRandomInterval randInterval = new FromRandomInterval();
		System.out.println(randInterval.randomByInterval(5, 10));
	}
	
	
}
