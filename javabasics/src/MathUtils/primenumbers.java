package MathUtils;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max = 100;
System.out.println("Generate Prime numbers between 1 and " + max);
//loop through the numbers one by one
for (int i = 1; i<max; i++) {
	boolean isPrimeNumber = true;
	for(int j=2;j<i;j++){
		if(i%j==0){
			isPrimeNumber = false;
			break;
		}
	}
	if(isPrimeNumber){
		System.out.println(i+" ");
	}
}
	}

}
