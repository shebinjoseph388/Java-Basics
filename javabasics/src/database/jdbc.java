package database;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Arrays;
public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	//load the mysql JDBC Driver
	String driverName = "com.mysql.jdbc.Driver";
	Class.forName(driverName);
	// Get the Driver instance
	String serverName ="localhost";
	String schema = "test";
	String url = "jdbc:mysql://"+serverName+"/"+schema;
	Driver driver= DriverManager.getDriver(url);
	//Get Available properties
	DriverPropertyInfo properties[] = driver.getPropertyInfo(url,null);
	for(int i=0;i<properties.length;i++){
		//property Information
		String name = properties[i].name;
		boolean required = properties[i].required;
		String value = properties[i].value;
		String[] choices = properties[i].choices;
		String description = properties[i].description;
		
		
		 System.out.println("Property : " + name + "nRequired : " + required + "nValue : " + value + "nDescription : "
		+ description + "nChoices : " + (choices!=null?Arrays.asList(choices):null) + "n");
	
	}
}catch(ClassNotFoundException e){
	System.out.println("Could not find the database driver " + e.getMessage());
 } catch (SQLException e) {

 System.out.println("Could not retrieve database metadata " + e.getMessage());
}
	}

}
