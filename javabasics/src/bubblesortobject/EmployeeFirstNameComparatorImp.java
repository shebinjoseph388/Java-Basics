package bubblesortobject;
import java.util.Comparator;
//this class implements the comparator interface of the type Employee and provides the comparison rules by
//overridingthe compare().
public class EmployeeFirstNameComparatorImp implements Comparator<Employee>{
	@Override
	 public int compare(Employee o1, Employee o2) {
	 if(o1.getFirstName().compareTo(o2.getFirstName()) > 0){
	 return 1;
	 }else if(o1.getFirstName().compareTo(o2.getFirstName()) < 0){
	return -1;
	 }else{
 return 0;
	}
	
	 }
}
