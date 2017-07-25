package corejava2;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import javax.xml.bind.DatatypeConverter;
import java.util.*;
public class Base64Examples
{

    public static void main( String[] args ) throws IOException
    {
        basic();

        basicRejects();

        url();

        mime();

        wrap();
    }

    private static void wrap() throws FileNotFoundException, IOException, UnsupportedEncodingException
    {
        /* with the wrap methods it is possible to encode/decode complete files */

        String buffer = "oviedin oviedin";
        File file = new File( "outputStream.txt" );
        OutputStream outputStream = new FileOutputStream( file );
        OutputStream wrappedOS = Base64.getEncoder().wrap( outputStream );
        wrappedOS.write( buffer.getBytes( "utf-8" ) );

        InputStream inputStream = new FileInputStream( file );
        InputStream unWrappedIS = Base64.getDecoder().wrap( inputStream );

        int count;
        byte[] hundredbytes = new byte[100];
        while( ( count = unWrappedIS.read( hundredbytes ) ) != -1 )
        {
            System.out.print( new String( hundredbytes, 0, count, "utf-8" ) );
        }
    }

    private static void mime() throws UnsupportedEncodingException
    {
        // MIME alphabet

        StringBuilder buffer = new StringBuilder();
        for( int i = 0; i < 30; i++ )
        {
            buffer.append( Math.random() * 100 + "" );
        }

        System.out.println( "buffer: " + buffer );

        String encodedBuffer = Base64.getMimeEncoder().encodeToString( buffer.toString().getBytes( "utf-8" ) );

        System.out.println( "encodedBuffer MIME: " + encodedBuffer );

        byte[] decodedBuffer = Base64.getMimeDecoder().decode( encodedBuffer );

        System.out.println( "decodedBuffer MIME: " + new String( decodedBuffer, "utf-8" ) );
    }

    private static void url() throws UnsupportedEncodingException
    {
        /* url enconding and decoding */
        String url = "subjects?mathematics";

        System.out.println( "url " + url );

        // no difference for complete urls since base64 seems to get this
        String urlEncoded = Base64.getUrlEncoder().encodeToString( url.getBytes( "utf-8" ) );

        String urlEncodedBasic = Base64.getEncoder().encodeToString( url.getBytes( "utf-8" ) );

        System.out.println( "url encoded " + urlEncoded );

        System.out.println( "url encoded basic " + urlEncodedBasic );

        byte[] urlDecoded = Base64.getUrlDecoder().decode( urlEncoded );

        System.out.println( "url decoded " + new String( urlDecoded, "utf-8" ) );
    }

    private static void basicRejects() throws UnsupportedEncodingException
    {
        try
        {
            String str = "España va muy bien and German uses ö, ä and ü";
            byte[] decodedStr = Base64.getDecoder().decode( str );
        }
        catch( Exception ex )
        {
            ex.printStackTrace();
        }
    }

    private static void basic() throws UnsupportedEncodingException
    {
        String str = "this is an string";
        System.out.println( "Original string " + str );
        /* encode and decode basic */
        String strEncoded = Base64.getEncoder().encodeToString( str.getBytes( "utf-8" ) );

        System.out.println( "Encoded using basic encoding " + strEncoded );

        byte[] decodedStr = Base64.getDecoder().decode( strEncoded );

        System.out.println( "Decoded using basic decoding " + new String( decodedStr, "utf-8" ) );

        /* special chars basic */
        String strWithSpecialChars = "this is an String / with an slash ? ad interrogation point and a # sharp";

        System.out.println( "Original string " + strWithSpecialChars );

        String strEncodedSpecialChars = Base64.getEncoder().encodeToString( strWithSpecialChars.getBytes( "utf-8" ) );

        System.out.println( "Special encoded using basic encoding " + strEncodedSpecialChars );

        byte[] decodedStrSpecial = Base64.getDecoder().decode( strEncodedSpecialChars );

        System.out.println( "Decoded special using basic decoding " + new String( decodedStrSpecial, "utf-8" ) );
    }
}
