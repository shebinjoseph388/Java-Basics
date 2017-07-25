package bubblesortobject;
import java.util.Comparator;
/*
 * The utility class which contains static methods.This class is a utility class which contains static methods used to sort a given array of a type
 * */
public class SortingUtility {
	// order constants which tells at what order the array should be sort
	public static final int ASC_ORDER = 1;
	public static final int DESC_ORDER = 2;
	/* We want this class as a utility class that contains only static methods.
 * So, avoiding any creation of an object of this class by keeping its
	 * constructor as private and also throwing an AssertionError to avoid
	 * any accidently creation of an object within the class.
	* */
	private SortingUtility(){
		throw new AssertionError();
	}
	public static<T extends Comparable<T>> void sort(T []a){//This method is used to sort a given array of a type T.
		//The class T should implement the Comparable Interface and provides an implementation of the overridden compareTo()
		//Otherwise it will throw ClassCastException
		bubbleSortInAscOrder(a);
	}
	public static<T> void sort(T []a,Comparator<? super T>comparator){//this method is used to sort a given array of type T
		//it also takes an instance of a Comparator interface.The comparator provides rules to compare the objectof type T
		bubbleSortInAscOrder(a,comparator);
	}
	public static<T extends Comparable<T>> void sort(T []a,int order){
		if(order == ASC_ORDER){
			bubbleSortInAscOrder(a);
		}else if(order == DESC_ORDER){
			bubbleSortInDescOrder(a);
		}else{
			throw new UnsupportedOperationException("The order tou specified is not supported");
		}
	}
public static<T> void sort(T []a,int order,Comparator<? super T>comparator){
	if(order == ASC_ORDER){
		 bubbleSortInAscOrder(a,comparator);
	}else if(order == DESC_ORDER){
		 bubbleSortInDescOrder(a,comparator);
		 }else{
		 throw new UnsupportedOperationException("The order you specified is not supported.");
		 }
}
private static<T extends Comparable<T>> void bubbleSortInAscOrder(T []a){
	int left = 0;
	int right = a.length-1;
	 // the outer loop, runs from right to left
	for(int i=right;i>1;i--){
	// the inner loops, runs from left to the right, limited by the outer loop
	 for(int j=left;j<i;j++){
	 // if the left item is greater than the right one, swaps
		 if(((Comparable<T>)a[j]).compareTo(a[j+1])>0){
			 swap(a,j,j+1);
		 }
	 }
	}
}
private static<T extends Comparable<T>> void bubbleSortInDescOrder(T []a){
	int left = 0;
	 int right = a.length-1;	// the outer loop, runs from right to left
for(int i=right;i>1;i--){
	 // the inner loops, runs from left to the right, limited by the outer loop
 for(int j=left;j<i;j++){
 // if the left item is smaller than the right one, swaps
	 if(((Comparable<T>)a[j]).compareTo(a[j+1]) < 0){
 swap(a,j, j+1);
	 }
 }
	 }
}
private static<T> void bubbleSortInAscOrder(T []a,Comparator<? super T>comparator){
	int left =0;
	int right = a.length-1;
	// the outer loop, runs from right to left
 for(int i=right;i>1;i--){
// the inner loops, runs from left to the right, limited by the outer loop
for(int j=left;j<i;j++){
	 // if the left item is greater than the right one, swaps
 if(comparator.compare(a[j], a[j+1]) > 0){
	 swap(a,j, j+1);
	 }
	 }
 }
}
private static<T> void bubbleSortInDescOrder(T []a,Comparator<? super T>comparator){
 int left = 0;
 int right = a.length-1;
// the outer loop, runs from right to left
 for(int i=right;i>1;i--){
 // the inner loops, runs from left to the right, limited by the outer loop
 for(int j=left;j<i;j++){
 // if the left item is smaller than the right one, swaps
if(comparator.compare(a[j], a[j+1]) < 0){
 swap(a,j, j+1);
 }
 }
}
 }
private static void swap(Object []a,int left,int right){
	Object temp = a[left];
	a[left]=a[right];
	a[right]=temp;
}
}

