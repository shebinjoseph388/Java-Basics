package MathUtils;
import java.util.Scanner;
public class fibonnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long primo = 0,secondo =1,res;
Scanner sc = new Scanner(System.in);
System.out.println("How many no's ?");
int limit = sc.nextInt();
for(int i=0;i<limit;i++){
	System.out.println(primo+" ");
	res = primo+secondo;
	primo = secondo;
	secondo = primo;
}
sc.close();
	}

}
