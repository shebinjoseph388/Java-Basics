package database;
import java.sql.Connection;

 import java.sql.DriverManager;
 import java.sql.SQLException;
public class SQLExceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Connection connection = null;
		// Load the Oracle JDBC driver
	
		 String driverName = "oracle.jdbc.driver.OracleDriver";
		
		 Class.forName(driverName);
	
		
	 // Create a connection to the database
	
	 String serverName = "localhost";
	
	String serverPort = "1521";
		
	String sid = "mySchema";
		
	String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
	
	 String username = "username";
	
		String password = "password";
	
	 connection = DriverManager.getConnection(url, username, password);
	
	 System.out.println("Successfully Connected to the database!");
	
	} catch (ClassNotFoundException e) {
		
		 System.out.println("Could not find the database driver " + e.getMessage());
		 }catch(SQLException e){
			 while(e != null){
				 
				// the reason for the exception
				 String msg = e.getMessage();
				// vendor-specific codes for the error
				 int errorCode = e.getErrorCode();
				 String sqlState = e.getSQLState();
				// To execute code based on the specific error code we should first check the driver used
				 String driverName;
				 try{
					 
					 driverName = connection.getMetaData().getDriverName();
					 if(driverName.equals("Oracle JDBC Driver")&& errorCode ==123){
						// Process error specific to Oracle database ...
					 }
				 }catch(SQLException e1){
					 System.out.println("Could not retrieve the database metadata"+e1.getMessage());
				 }
				// The exception may have been chained; process the next exception in the chain
				 e = e.getNextException();
			 }
		 }
	}

}
