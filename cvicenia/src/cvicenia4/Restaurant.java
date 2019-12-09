package cvicenia4;

public class Restaurant {

	int cooks;
	int waiters;
	
	
	public int countEmployees() {
		return cooks + waiters;
	}
	
	public Restaurant(int cooks, int waiters) {
		this.cooks = cooks;
		this.waiters = waiters;
	}
	
}
