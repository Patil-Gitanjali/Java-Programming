/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program254.java
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
        
        return new String(Arr);    //change ( Not Preferable)

     }
         
}
class Program254
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
        StringX strobj = new StringX();

        sobj = strobj.Update(sobj);  //change

        System.out.println("Updated String:"+sobj);
    }
}