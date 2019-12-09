package cvicenia5.commandLine;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("Enter your age: ");
		boolean success = false;
		while (!success) {
			try {
				age = scanner.nextInt();
				success = true;
			} catch(java.util.InputMismatchException e) {
				System.out.println("Enter number: ");
			}
		}
		System.out.println(String.format("Hello %s, your are %d years old.", name, age));
	}
}
