package OOPS_2;

public class UseEnggStudent3 {
	public static void main(String[]args) {
		
		EnggStudent civil = new EnggStudent("Revanth",25,849,"MNM",false,
				"CIVIL","finalSemester",0,72);
		System.out.println(civil);
		System.out.println(civil.getName());
		System.out.println(civil.getAge()+" "+civil.getId());
	}
}

class EnggStudent extends CollegeStudent{
	private String department;
	private String semester;
	private int arrears;
	private int percentage;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getArrears() {
		return arrears;
	}
	public void setArrears(int arrears) {
		this.arrears = arrears;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public EnggStudent(String name, int age, int id, String collegeName, boolean isUniform,
			String department, String semester, int arrears, int percentage) {
		super(name,age,id,collegeName,isUniform);
		this.department = department;
		this.semester = semester;
		this.arrears = arrears;
		this.percentage = percentage;
	}
	public String toString() {
		return super.toString()+" "+department+" "+semester+" "+arrears+" "+percentage;
	}
}

class CollegeStudent extends Student{
	private String collegeName;
	private boolean isUniform;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String colName) {
		this.collegeName = colName;
	}
	public boolean getUniform() {
		return isUniform;
	}
	public void setUniform(boolean isUniform) {
		this.isUniform = isUniform;
	}
	
	public CollegeStudent(String name,int age, int id,String collegeName, boolean isUniform) {
		super(name,age,id);
		this.collegeName = collegeName;
		this.isUniform = isUniform;
	}
	public String toString() {
		return super.toString()+" "+collegeName+" "+isUniform;
	}
}

class Student {
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(String name,int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String toString() {
		return name+" "+age+" "+id;
	}
}

	//	INHERITANCE = the properties of one class can be acquired or inherited,
	//	to the another class through the extends keyword is known as inherit.
	//	keyword = extends