package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class rollback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection connection = null;
try{
	// Load the Oracle JDBC driver
	// for oracle String driverName="oracle.jdbc.driver.OracleDriver";
//for sqlserver String driverName ="com.jnetdirect.jsql.JSQLDriver";
	String driverName = "com.mysql.jdbc.Driver";	
	Class.forName(driverName);
	// Create a connection to the database
	String serverName = "localhost";
	String serverPort = "1521";
	String sid = "mySchema";
	//for SQlserver String url = "jdbc:JSQLConnect://"+serverName+":"+serverPort;
	// for oracle String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
	String url = "jdbc:mysql://"+serverName+"/"+sid;
	String username = "username";
	String password = "password";
	connection = DriverManager.getConnection(url,username,password);
	System.out.println("Successfully connect tothe database");
}catch(ClassNotFoundException e){
	System.out.println("Could notfind the database driver"+e.getMessage());
}catch(SQLException e){
	System.out.println("could not connect to the database"+e.getMessage());
}
try{
	//Disable auto commit
	connection.setAutoCommit(false);
	//Do sql upates
	//Commit updates
	connection.commit();
	System.out.println("Successfully committed changes to the databas");
}catch(SQLException e){
	try{
		//Rollback update
		connection.rollback();
		System.out.println("Successfully rolled back changes from the database");
	}catch(SQLException e1){
		System.out.println("Could not rollback updates"+e1.getMessage());
	}
}
	}

}
