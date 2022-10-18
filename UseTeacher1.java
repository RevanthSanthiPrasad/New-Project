package OOPS_2;

public class UseTeacher1 {
	public static void main(String[]args) {
		Teacher s = new Teacher();
		s.name = "SanthiPrasad";
		s.age = 58;
		s.salary = 60000;
		s.id = 1964;
		s.experience = "27years";
		
		System.out.println(s.name+" "+s.age+" "+s.salary+" "+s.id+" "+s.experience);
	}
}

class Teacher extends Human {
	int salary;
	int id;
	String experience;
}

class Human {
	String name;
	int age;
}

	//	INHERITANCE = the properties of one class can be acquired or inherited,
	//	to the another class through the extends keyword is known as inherit.
	//	keyword = extends