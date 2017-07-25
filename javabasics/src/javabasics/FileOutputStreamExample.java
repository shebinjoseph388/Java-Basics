package javabasics;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {

    private static final String OUTPUT_FILE = "H:\\sherin\\sherin.txt";
    public static void main(String[] args) {

        String content = "Hello Java Code Geeks";

        byte[] bytes = content.getBytes();

        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(OUTPUT_FILE),1024)) {

            // write a byte sequence
            out.write(bytes);

            // write a single byte
            out.write(bytes[0]);

            // write sub sequence of the byte array
            out.write(bytes,4,10);

            // flush the outputstream
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}