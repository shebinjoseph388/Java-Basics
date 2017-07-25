package javabasics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author shebin
 */
public class scannereg {
    
    public static void main(String[] args)
    {
        try{
        String input = "1 fish 2 fish red  fish blue fish";
        System.out.print("Enter anyvalue");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("no"+x);
        Scanner sc1 = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(sc1.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc1.next());
         System.out.println(sc1.next());
         sc.close();
         sc1.close();
        }catch(Exception e){
            
        }
    }
}
