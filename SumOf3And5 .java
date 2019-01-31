import java.util.*;
public class SumOf3And5 {
public static long divide(int n,int p)
{
     long q=( n*(p/n)*((p/n)+1))/2;
   
    System.out.println(q);
    return q;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(divide(3,n-1)+divide(5,n-1)-divide(15,n-1));
        }
    }
}
