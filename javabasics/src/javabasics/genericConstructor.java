package javabasics;

public class genericConstructor{
    public static void main(String args[]) {
        genericclass c1 = new genericclass(100);
        genericclass c2 = new genericclass(123.5F);
        c1.values();
        c2.values();
    }
}
 class genericclass {
  private double value;
  <T extends Number> genericclass(T arg){
      value = arg.doubleValue();
      
  }
  void values(){
      System.out.println("val :"+value);
  }
}

