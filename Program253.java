/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program253.java
//  Description :  
//  Input :         Hello       
//  Output :        _ello      
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
     public String Update(String str)
     {

        char Arr[] = str.toCharArray();

        Arr[0] = '_';
        
        return new String(Arr);    //change

     }
         
}
class Program253
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
        StringX strobj = new StringX();

        sRet = strobj.Update(sobj);

        System.out.println("Updated String:"+sRet);
    }
}