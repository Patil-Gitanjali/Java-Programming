/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program255.java
//  Description :  
//  Input :         HELLO world      
//  Output :        hello world     
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
     public String toLowerCaseX(String str)
     {
        int iCnt = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }
        
        return new String(Arr);    
     }
         
}
class Program255
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
        StringX strobj = new StringX();

        sRet= strobj.toLowerCaseX(sobj);  

        System.out.println("Updated String:"+sRet);
    }
}