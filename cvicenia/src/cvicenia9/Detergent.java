package cvicenia9;

class Cleanser {
	  private String s = new String("Cleanser");
	  public void append(String a) { s += a; }
	  public void dilute() { append(" dilute()"); }
	  public void apply() { append(" apply()"); }
	  public void scrub() { append(" scrub()"); }
	  public String toString() { return s; }
	  public static void main(String[] args) {
	    Cleanser x = new Cleanser();
	    x.dilute(); x.apply(); x.scrub();
	    System.out.println(x);
	  }
	}

	public class Detergent extends Cleanser {
	  // Change a method:
	  public void scrub() {
	    append(" Detergent.scrub()");
	    super.scrub(); // Call base-class version
	  }
	  // Add methods to the interface:
	  public void foam() { append(" foam()"); }
	  // Test the new class:
	  public static void main(String[] args) {
	    Detergent x = new Detergent();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    System.out.println(x);
	    Cleanser.main(args);
	  }
	} ///:~
