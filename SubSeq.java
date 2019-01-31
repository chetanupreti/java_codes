import java.util.*;
public class SubSeq{
public static void sub(String s)
{
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<=s.length();j++)
        {
            System.out.println(s.substring(i,j));
        }
    }
}
     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
          String s1=sc.next();
          sub(s1);
         
          
     }
}