package javabasics;
import java.util.Date;
import java.util.GregorianCalendar;
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Person[] people = new Person[2];
//fill the people array with Student and Employee objects
 people[0]=new Employee("Harry James",50000,1989,12,1);
 people[1]=new Student("MArry john","MCA");
//print out names and descriptions of all Person objects
 for(Person p: people){
	 System.out.println(p.getName()+','+p.getDescription());
 }
	}

}
abstract class Person{
	private String fullName;
	public Person(String n){
		this.fullName = n;
	}
	public abstract String getDescription();
	//{abstract method does not have body 
	//	return fullName;
	//}
	public String getName()
	{
		return fullName;
	}
}
class Employee extends Person{
	private double salary;
	private Date hireday;
	public Employee(String n,double s,int year,int month,int day){
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireday = calendar.getTime();
	}
	public double getSalary(){
		return salary;
	}
	public Date gethireday(){
		return hireday;
	}
	@Override 
	public String getDescription(){
		return String.format("an employeewith a salary of $%.2f ", salary);
	}
}
class Student extends Person{
	private String major;
	public Student(String n,String m){
		// pass n to superclass constructor
		super(n);
		major =m;
	}
	@Override
	public String getDescription()
	{
		return "a student majoring in "+major;
	}
}