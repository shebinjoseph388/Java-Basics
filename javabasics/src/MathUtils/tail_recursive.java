package MathUtils;

public class tail_recursive {
public static final int tailrecursive(int n){
	return factorial(n,1);
}
public static final int factorial(int n,int accum){
	if(n==0){
		return accum;
	}else{
		return factorial(n-1,n*accum);
	}
}
}
/*tailrecurciveFact(4) = factorial(4,1)
 factorial(4,1) = factorial(3,4*1)
 factorial(3,4*1) = factorial(2,4*1*3)
 factorial(2,4*1*3) = factorial(1,4*1*3*2)
 factorial(1,4*1*3*2) = factorial(0,4*1*3*2*1) = 24
 factorial(2,4*1*3) = 24
 factorial(3,4*1) = 24
 factorial(4,1) = 24
 tailrecurciveFact(4) = 24;
 * 
 */
