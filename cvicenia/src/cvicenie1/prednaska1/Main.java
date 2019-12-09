package cvicenie1.prednaska1;

import java.util.ArrayList;
import java.util.Random;

import com.github.javafaker.Faker;

public class Main {
	public static void main(String[] args) {
		Faker faker = new Faker();
		Random rand = new Random();
		ArrayList<Student> students = new ArrayList<Student>();
		for (int i = 1; i <= 10; i++) {
			int randDay = rand.nextInt(30) + 1;
			int randMonth = rand.nextInt(12) + 1;
			int randYear = rand.nextInt(2) + 2004;
			if (rand.nextInt(24) == 0)
				students.add( new Student(i, faker.name().firstName(), faker.name().lastName(), faker.name().firstName(), randDay, randMonth, randYear));
			else
				students.add( new Student(i, faker.name().firstName(), faker.name().lastName(), null, randDay, randMonth, randYear) );
		}
		
		for (Student student : students) {
			System.out.println(student.fullName() + " " + student.birthDay + "/" + student.birthMonth + "/" + student.birthYear);
		}
			
	}
}
