package xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class PropertiesToXMLFileExample {
private static final String xmlFilePath ="H:\\sherin\\sherin.xml";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties= new Properties();
		properties.setProperty("email", "sen@gmail.com");
		OutputStream outputstream=null;
		try {
			outputstream = new FileOutputStream(xmlFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.storeToXML(outputstream,"email","UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("Xml file was created");
	}

}
