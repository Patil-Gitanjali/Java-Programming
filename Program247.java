/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program247.java
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

class Program247
{
    public static void main(String A[])
    {   
        int iCnt = 0;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
       char Arr[] = sobj.toCharArray();
       for(iCnt = 0; iCnt <Arr.length; iCnt++)
       {
          System.out.println(Arr[iCnt]);

       }
       
    }
}