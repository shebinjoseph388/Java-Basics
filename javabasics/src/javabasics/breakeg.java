package javabasics;

public class breakeg {
    public static void main(String args[]){
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Printing first odd number ");
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0) break;//continue;
            else
                System.out.println(array[i]+" ");
        }
    }
    
}