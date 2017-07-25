package bubblesortobject;

public class BubblesortObjectExampl {
	public static void main(String[] args) {
		Employee []employees = new Employee[5];
		Employee employee = new Employee("John","Carter",5658);
		employees[0]=employee;
		employee = new Employee("Mary","Carter",7412);
		 employees[1] = employee;
	employee = new Employee("Alex","Lumb",1158);
	 employees[2] = employee;
	 employee = new Employee("David","Jhonson",1254);
	 employees[3] = employee;
		employee = new Employee("Shaun","Smith",4587);
	 employees[4] = employee;
	 System.out.println("Sorting in ascending order on basis of employeeCode...\n");
	 printArray(employees);
	  SortingUtility.sort(employees);
	 System.out.println("After sorting...");
	  printArray(employees);
	  System.out.println("\nSorting in ascending order on basis of employeeFirstName...\n");
 printArray(employees);
	 SortingUtility.sort(employees,new EmployeeFirstNameComparatorImp());
 System.out.println("After sorting...");
	 printArray(employees);
	 System.out.println("\nSorting in ascending order on basis of employeeLastName...\n");
	  printArray(employees);
	  SortingUtility.sort(employees,new EmployeeLastNameComparatorImpl());
	  System.out.println("After sorting...");
	  printArray(employees);
	 
	  System.out.println("\nSorting in descending order on basis of employeeCode...\n");
	  printArray(employees);
	  SortingUtility.sort(employees,SortingUtility.DESC_ORDER);
	  System.out.println("After sorting...");
	  printArray(employees);
	 
	  System.out.println("\nSorting in descending order on basis of employeeFirstName...\n");
	  printArray(employees);
	  SortingUtility.sort(employees,SortingUtility.DESC_ORDER,new EmployeeFirstNameComparatorImp());
	  System.out.println("After sorting...");
	 printArray(employees);
	 System.out.println("\nSorting in descending order on basis of employeeLastName...\n");
	  printArray(employees);
	 SortingUtility.sort(employees,SortingUtility.DESC_ORDER,new EmployeeLastNameComparatorImpl());
	  System.out.println("After sorting...");
	 printArray(employees);
	 
	}
	public static<T> void printArray(T []a){
		 for(T t : a){
		System.out.println(t);
	 }
	 }
}
