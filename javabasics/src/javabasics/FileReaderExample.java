package javabasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    private static final String OUTPUT_FILe = "H:\\sherin\\sherin.txt";
    public static void main(String[] args) {

        String str = "";
        try (BufferedReader bufReader = new BufferedReader(new FileReader(new File(OUTPUT_FILe)),1024)) {

            while ( (  str = bufReader.readLine() ) != null )
                System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
