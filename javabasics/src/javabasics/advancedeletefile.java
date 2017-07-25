package javabasics;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//nio's method offers that extremely useful feature for file handling.
public class advancedeletefile {
 private static final String FILE_PATH = "H:\\eg\\eg.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	advancedeletefile.deleteFileNIO(FILE_PATH);
}catch (IOException e) {
	 e.printStackTrace();
	 }
	}
public static void deleteFileNIO(String filePath) throws IOException{
	Path path = Paths.get(filePath);
	Files.delete(path);
}
}
