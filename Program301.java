////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :     program301.java
//  Description :     Collections  [HashTable]
//                  
//  Input       :         
//  Output      :        
//  Author      :      Gitanjali Patil
//  Date        :      30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

import java.util.*;

class Program301
{
    public static void main(String A[])
    {
       Hashtable <String, Integer> hobj = new Hashtable <String, Integer>();

       hobj.put("PPA",27000);
       hobj.put("LB",28000);
       hobj.put("LSP",29000);
       hobj.put("PYTHON",30000);

       System.out.println(hobj);

       System.out.println(hobj.keys());

       Enumeration eobj = hobj.keys();

       while(eobj.hasMoreElements())
       {
            System.out.println(eobj.nextElement());
            System.out.println(hobj.get(eobj.nextElement()));
       }
    }
}