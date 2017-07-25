package MathUtils;

public class factorial {
public static int simpleFact(int n){
	int result = 1;
	for(int i=1;i<=n;i++){
		result*=i;
	}
	return result;
}
}
