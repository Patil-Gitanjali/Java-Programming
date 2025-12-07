/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  File Name  :   Program250.java
//  Description :  
//  Input :       Jay Ganesh           
//  Output :      Frequency of small characters : 7        
//  Author :       Gitanjali Patil
//  Date :          28/11/2025
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program250
{
    public static void main(String A[])
    {
        int iRet = 0;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        
        iRet = strobj.CountSmall(sobj);

        System.out.println("Frequency of small characters : "+iRet);
    }
}