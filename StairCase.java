import java.util.Scanner;
public class StairCase{
public static void stairCase(int n)
{
    for(int i=n;i>0;i--)
    {
        for(int j=0;j<i-1;j++)
        {
            System.out.print(" ");
        }
        for(int k=i-1;k<n;k++)
        {
            System.out.print("#");
        }
        System.out.println("");
    }
}
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       stairCase(n);
     }
}