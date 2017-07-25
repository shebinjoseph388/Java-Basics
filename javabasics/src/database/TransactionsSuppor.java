package database;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class TransactionsSuppor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection connection = null;
try{
	// Load the Oracle JDBC driver using API method of the Class ie forName.
	String driverName = "oracle.jdbc.driver.OracleDriver";
	Class.forName(driverName);
	// Create a connection to the database using API method of the DriverManager ie getConnection
	String serverName = "localhost";
	String serverPort = "1521";
	String sid = "mySchema";
	String url ="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
	String username = "username";
	String password = "password";
	connection = DriverManager.getConnection(url,username,password);
	System.out.println("Successfully Connected to the database!");
}catch(ClassNotFoundException e){
	System.out.println("could not found the database driver"+e.getMessage());
}catch(SQLException e){
	System.out.println("could not connect to the database"+e.getMessage());
}
try{
	//Check whether this database supports transactions,using API method of the DatabaseMetaData ie supportsTransactions()
	DatabaseMetaData metaData = connection.getMetaData();
	if(metaData.supportsTransactions())
	{
		System.out.println("Transactions are supported");
	}else{
		System.out.println("Transactions not supported");
	}
}catch(SQLException e){
	System.out.println("could not get the database metadata"+e.getMessage());
}

try {

 Statement statement = connection.createStatement();


 /* TRUNCATE is faster than DELETE since
55
56 * it does not generate rollback information and does not
57
58 * fire any delete triggers
59
60 */

 statement.executeUpdate("TRUNCATE test_table");


 System.out.println("Successfully truncated test_table");

 } catch (SQLException e) {
System.out.println("Could not truncate test_table " + e.getMessage());
 }


	try {
	

		 /*
		54
		55 * For deletes that are not executed frequently we should use the statement API.
		56
		57 * deleteCount contains the number of deleted rows
		58
		59 */
	
	 Statement statement = connection.createStatement();

	 int deleteCount = statement.executeUpdate("DELETE FROM test_table WHERE test_col='test_value_1'");
	
		
	 System.out.println("Deleted test_value_1 row successfully : " + deleteCount);
	
	
		
	 /*
		71
		72 * For deletes that are executed frequently we should
		73
		74 * use the prepared statement API.
		75
		76 * deleteCount contains the number of deleted rows
		77
		78 */

	 PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM test_table WHERE test_col=?");
	
	preparedStatement.setString(1, "test_value_2");
	
	deleteCount = preparedStatement.executeUpdate();
	 
	 
	
	System.out.println("Deleted test_value_2 row successfully : " + deleteCount);
	
	  } catch (SQLException e) {
	
	System.out.println("Could not execute statement " + e.getMessage());
	 }
	
	}
	}
	


