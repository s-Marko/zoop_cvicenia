package cvicenia4;

public class Main {
	
	public static void main (String[] args) {

		for (int i = 0; i < 10; i++)
			new H(i, i);
		
		System.out.print(H.getInstances());
	}
}


