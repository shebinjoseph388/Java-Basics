package bubblesortobject;

import java.util.Comparator;

 public class EmployeeLastNameComparatorImpl implements Comparator<Employee> {

 @Override
 public int compare(Employee o1, Employee o2) {
 if(o1.getLastName().compareTo(o2.getLastName()) > 0){
 return 1;
 }else if(o1.getLastName().compareTo(o2.getLastName()) < 0){
 return -1;
 }else{
 return 0;
 }

 }
 }