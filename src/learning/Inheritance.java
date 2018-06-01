package learning;

class Organization {
	String designation = "Analyst";
	String dept = "UnderWriting";
	void duty(){
		System.out.println("Duty: Analysis");
	}
}
public class Inheritance extends Organization{
	String empname = "Robert";
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		System.out.println("Department: " + obj.dept);
		System.out.println("Designation: " + obj.designation);
		System.out.println("Name: " + obj.empname);
		obj.duty();
		}
}
	

