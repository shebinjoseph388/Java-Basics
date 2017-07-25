package javabasics;

public class CatchMultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We demonstrate with a short password
		try{
			CatchMultipleExceptions.checkPass("pass");
			}catch(NoPassException e){
				e.printStackTrace();
			}catch(ShortPassException e){
				e.printStackTrace();
			}finally{
				System.out.println("finally block will always executed");
			}
		// We demonstrate with no password
		try{
			CatchMultipleExceptions.checkPass(null);
		}catch(NoPassException e){
			e.printStackTrace();
		}catch (ShortPassException e) {
			
			
			 e.printStackTrace();
			
			 } finally {
			
		 System.out.println("Finally block is always executed");
			 }
		// We demonstrate with valid password
		
		 try {
		
		 CatchMultipleExceptions.checkPass("123456");
		
		
		 System.out.println("Password check : OK");
		
		 } catch (NoPassException e) {
		
		 e.printStackTrace();
		
		 } catch (ShortPassException e) {
		
		
		 e.printStackTrace();
		
		 } finally {
		
	System.out.println("Finally block is always executed");
	
		 }
	}
	// Our business method that check password validity and throws NoPassException and ShortPassException
	public static void checkPass(String pass) throws NoPassException,ShortPassException{
		int minpasslength =5 ;
		if(pass == null)
			throw new NoPassException("No pass Provided");
		if(pass.length()<minpasslength)
			throw new ShortPassException("The password provided is too short");
	}

}
class NoPassException extends Exception{
	NoPassException(){
		
	}
	NoPassException(String msg){
		super(msg);
	}
	NoPassException(String msg,Throwable cause){
		super(msg,cause);
	}
}
class ShortPassException extends Exception{
	ShortPassException(){
		
	}
	ShortPassException(String msg){
		super(msg);
	}
	ShortPassException(String msg,Throwable cause){
		super(msg,cause);
	}
}