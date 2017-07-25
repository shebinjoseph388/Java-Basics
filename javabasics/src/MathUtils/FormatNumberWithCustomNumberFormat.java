package MathUtils;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class FormatNumberWithCustomNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumberFormat formatter;
String number;
//0 --> a digit or 0 if no digit present
formatter = new DecimalFormat("00000");
number = formatter.format(-1234.567);
System.out.println("Number 1 :"+number);

formatter = new DecimalFormat("0000.000");
number = formatter.format(-1234.567);
System.out.println("number2 :"+number);

//# --> a digit or nothing if no digit present
formatter = new DecimalFormat("##");
number = formatter.format(-1234.567);
System.out.println("number 3 :"+number);
 
formatter = new DecimalFormat("##000");
number = formatter.format(0);
System.out.println("Number 4:"+number);

//. --> the decimal point
formatter = new DecimalFormat(".00");
number = formatter.format(-0.123);
System.out.println("Number 5 :"+number);
formatter = new DecimalFormat("0.00");
 number = formatter.format(-0.123);
System.out.println("Number 6: " + number);

 formatter = new DecimalFormat("#.#");
 number = formatter.format(-1234.567);
 System.out.println("Number 7: " + number);

 formatter = new DecimalFormat("#.######");
 number = formatter.format(-1234.567);
 System.out.println("Number 8: " + number);
 formatter = new DecimalFormat(".######");
  number = formatter.format(-1234.567);
 System.out.println("Number 9: " + number);
 
  formatter = new DecimalFormat("#.000000");
  number = formatter.format(-1234.567);
  System.out.println("Number 10: " + number);
 
  // , --> used to group numbers
formatter = new DecimalFormat("#,###,###");
  number = formatter.format(-1234.567);
 System.out.println("Number 11: " + number);
 
  number = formatter.format(-1234567.890);
  System.out.println("Number 12: " + number);
 
  // '--> used to quote literal symbols
 formatter = new DecimalFormat("'#'#");
  number = formatter.format(-1234.567);
  System.out.println("Number 13: " + number);
 
  formatter = new DecimalFormat("'text'#");
  number = formatter.format(-1234.567);
  System.out.println("Number 14: " + number);
	}

}
