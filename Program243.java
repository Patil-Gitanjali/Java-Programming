/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program243.java
//  Description :  Problems on String
//  Input :         //Hello           
//  Output :        // H  e   l  l  o           
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program243
{
    public static void main(String A[])
    {   
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String str = sobj.nextLine();
       
       for(iCnt = 0; iCnt < str.length(); iCnt++)
       {

           System.out.println(str.charAt(iCnt));
       }


    }
}