import java.util.Scanner;
public class Replace-
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=s1.replaceAll("-","");
       //System.out.println(s2);
       int count=s1.length()-s2.length();
       //System.out.println(count);
       String s3="";
       while(count>0)
       {
           s3=s3+"-";
           count--;
       }
       System.out.println(s3+s2);
    }
}