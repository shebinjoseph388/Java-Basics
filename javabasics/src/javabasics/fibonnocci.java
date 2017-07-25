package javabasics;

public class fibonnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max = 10;
long[] series = new long[max];
series[0]=0;
series[1]=1;
for(int i=2;i<max;i++){
	series[i]=series[i-1]+series[i-2];
}
System.out.println("Fibonacci Series for " + max);

 for (int i = 0; i < max; i++) {
 System.out.print(series[i] + " ");
 }
	}

}
