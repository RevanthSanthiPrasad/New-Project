package OOPS_2;

public class UseTeacher2 {
	public static void main(String[]args) {
		
		Teacher1 t1 = new Teacher1("Malini",50,50000,1971,"28years");
		
		System.out.println(t1);
	}
}

class Teacher1 extends Human1{
	int salary;
	int id;
	String experience;
	
	public Teacher1(String name,int age,int salary,int id,String experience) {
		
		// SUPER is a keyWord, is used to access the immediate parent class properties
		
		super(name,age);
		this.salary = salary;
		this.id = id;
		this.experience = experience;
	}
	public String toString() {
		return super.toString()+" "+salary+" "+id+" "+experience;
	}
}

class Human1 {
	String name;
	int age;
	public Human1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+" "+age;
	}
}

	//	INHERITANCE = the properties of one class can be acquired or inherited,
	//	to the another class through the extends keyword is known as inherit.
	//	keyword = extends