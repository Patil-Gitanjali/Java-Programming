/////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   Array program of OOP design
//                  [using geter seter method]     
//  Input :         integer
//  Output :        integer
//  Author :        Gitanjali Patil
//  Date :          7/11/2025
//
//////////////////////////////////////////////////////////////////////////////////

import java.util.*;

//oop Design

class ArrayX
{
     public int Arr[];
     public int iSize;

     public ArrayX(int no)
     {  
        System.out.println("Inside Constructor :");

        iSize = no;
        Arr = new int [iSize];
     }

     public void Accept()
     {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the elements of array :");

        for(i = 0; i < Arr.length; i++)
        {
           Arr[i] = sobj.nextInt();
        }
     }

     public void Display()
     {
         System.out.println("Elements of the array :");
         int i = 0;

         for(i = 0; i < Arr.length; i++)
         {
            System.out.println(Arr[i]);
         }
     }
}    

class Program104
{
    public static void main(String A[])
    {
      ArrayX aobj1 = new ArrayX(5);
      ArrayX aobj2 = new ArrayX(7);
      ArrayX aobj3 = new ArrayX(3);
    }
}