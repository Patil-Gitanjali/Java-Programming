/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program245.java
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

       System.out.println(sobj.length());

       System.out.println(Arr.length);


    }
}