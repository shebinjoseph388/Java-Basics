package javabasics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author shebin
 */
public class JavaUtilScannerExample {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter item code : ");
            String itemcode = sc.next();
            System.out.println("Enter price : ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
int quantity = sc.nextInt();
double total = price * quantity;
System.out.println();
System.out.printf("%d %s @ %f = %f", quantity, itemcode, price, total);
        }catch(Exception e){
            e.printStackTrace(System.err);
        }
    }
}
