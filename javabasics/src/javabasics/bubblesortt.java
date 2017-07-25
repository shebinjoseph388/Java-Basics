package javabasics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public class bubblesortt {
public static int []a;    
public static void main(String args[]){
    // gets random generated array
    a = getArray();
    printArray();
    sort();
    System.out.println();
    printArray();
}
public static void sort()
{
    int left = 0;
    int right = a.length - 1;
    bubbleSort(left,right);
}
private static void bubbleSort(int left,int right)
{
    // the outer loop, runs from right to left
    for(int i =right;i>1;i--)
    {
      // the inner loops, runs from left to the right, limited by the outer loop
        for(int j=left;j<i;j++){
            // if the left item is greater than the right one, swaps
            if(a[j] > a[j+1]){
 swap(j, j+1);
            }
        }
    }
}

// This method is used to swap the values between the two given index
public static void swap(int left,int right){
 int temp = a[left];
a[left] = a[right];
 a[right] = temp;
}
public static void printArray()
{
    for(int i: a){
        System.out.println(i+" ");
    }
}
public static int[] getArray(){
    int size =10;
    int []array = new int[size];
    int item=0;
    for(int i=0;i<size;i++){
        item =(int)(Math.random()*100);
        array[i]=item;
    }
    return array;
}
}
