/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program246.java
//  Description :  Problems on String
//  Input :        Hello             
//  Output :       H
//                 e
//                 l
//                 l
//                 o        
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program245
{
    public static void main(String A[])
    {   
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
       char Arr[] = sobj.toCharArray();

       System.out.println(Arr[0]);
       System.out.println(Arr[1]);
       System.out.println(Arr[2]);
       System.out.println(Arr[3]);
       System.out.println(Arr[4]);

    }
}