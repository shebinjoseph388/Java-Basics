package javabasics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputStreamExample {
	
public static final String INPUT_FILE="H:\\sherin\\sherin.txt";
	
	public static void main(String[] args){
		
		Path filePath = Paths.get(INPUT_FILE);
		
		String line ="";
		
		try ( BufferedReader bufferedReader = Files.newBufferedReader(filePath,Charset.defaultCharset()) ) {
			
			while  ( ( line =bufferedReader.readLine()) !=null ){
				System.out.println(line);
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
