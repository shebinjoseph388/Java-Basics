package MathUtils;

public class factorialGoto {
	public static int factoriall(int n,int accum){
		/*
		 * 
		 * goto is not implemented in java
		 * loop:
			 if(n==0)
			 return accum;
			 else{
			 accum*=n;
			 n -= 1;
		 goto loop;
			 }*/
		while(n!=0){
			accum = accum*n;
			n=n-1;
		}
		return accum;
	}
	

}
