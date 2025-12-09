/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program256.java
//  Description :  
//  Input :         Hello WORLD      
//  Output :        hELLO world     
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
     public String strToggleX(String str)
     {
        int iCnt = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
            else if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }
        
        return new String(Arr);    
     }
         
}
class Program256
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String sobj = scanobj.nextLine();
       
        StringX strobj = new StringX();

        sRet= strobj.strToggleX(sobj);  

        System.out.println("Updated String:"+sRet);
    }
}