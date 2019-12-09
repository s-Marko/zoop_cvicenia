package cvicenia3;

import java.util.Random;

public class FromRandomInterval {

	Random random = new Random();
	public int randomByInterval(int lowerLimit, int upperLimit) {
		int rand = random.nextInt(upperLimit);
		
		return rand;
	}
	
	public FromRandomInterval() {
		
	}
	
	
}
