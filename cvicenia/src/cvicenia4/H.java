package cvicenia4;

import java.util.ArrayList;

public class H {

	int at1;
	int at2;
	private static final ArrayList<H> instanceList = new ArrayList<H>();
	
	public static int getInstances() {
		return instanceList.size();
	}
	
	public H(int at1, int at2) {
		this.at1 = at1;
		this.at2 = at2;
		instanceList.add(this);
		System.out.println("Current number of 'H' instances is " + instanceList.size());
	}
	
	
}
