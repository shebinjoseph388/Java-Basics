package bubblesortobject;
//this class implements the comparable interface&overrides compareTo()
public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	private int employeeCode;
	public Employee(String fistName,String lastName,int emplyeeCode){
		this.firstName = fistName;
		 this.lastName = lastName;
		this.employeeCode = employeeCode;
		 }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String toString(){
		return "EmployeeCode : "+getEmployeeCode()+",Name : "+getFirstName()+" "+getLastName();
	}
	public int compareTo(Employee o){
		Employee e = (Employee)o;
		if(this.employeeCode > e.getEmployeeCode())
			return 1;
		if(this.employeeCode < e.getEmployeeCode())
		 return -1;
		 if(this.employeeCode == e.getEmployeeCode())
		 return 0;
		 return 0;
	}
}
