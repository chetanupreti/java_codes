import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder s1=new StringBuilder();
        s1.append(A);
        s1=s1.reverse();
      
        
       if(A.contentEquals(new StringBuilder(s1)))
       {
         System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
       
  
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



