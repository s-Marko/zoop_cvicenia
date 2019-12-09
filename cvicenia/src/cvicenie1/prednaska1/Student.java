package cvicenie1.prednaska1;

import java.util.ArrayList;
import java.util.Date;



public class Student {
	int id;
	String firstName;
	String middleName;
	String lastName;
	ArrayList<Student> friends = new ArrayList<Student>();
	int birthYear, birthMonth, birthDay;
	
	
	
	boolean isBirthDay() {
		
		Date date = new Date();
		System.out.println("date " + (date.getYear() + 1900));
		System.out.println(this.birthYear);
		return false;
	}
	
	int numberOfFriends() {
		return this.friends.size();
	}
	
	void giveWarning() {
		;
	}
	
	void addFriend(Student student) {
		if ( !(this.friends.contains(student)))
			this.friends.add(student);
		else
			return;
		student.addFriend(this);		
	}
	
	String fullName() {
		if (this.middleName != null)
			return (this.firstName + " " + this.middleName + " " + this.lastName);
		return (this.firstName + " " + this.lastName);
	}
	
	public Student(int id, String firstName, String lastName, String middleName, int birthDay, int birthMonth, int birthYear) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.friends = new ArrayList<Student>();
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}
	
}
