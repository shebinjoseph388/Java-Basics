package MathUtils;
import java.util.Scanner;
public class fibonnorecursive {
	public static long fibonnocci(long n){
		if(n<0)throw new IllegalArgumentException("Cannot accept negative arguments");
		return (n<2)?n:fibonnocci(n-1)+fibonnocci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit?");
int limit = sc.nextInt();
for(int i=0;i<limit;i++){
	System.out.println(fibonnocci(i)+" ");
}
	}

}
