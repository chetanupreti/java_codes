public class ClearkBit{
     static int change(int n,int k)
     {
         int t=~(1<<(k-1));
         return (n&t);
         
     }
     public static void main(String []args){
        int a=15;
        int k=2;
       System.out.println( change(a,k));
     }
}