public class Toggle{
     static int change(int n,int k)
     {
         int t=(1<<(k-1));
         return (n^t);
         
     }
     public static void main(String []args){
        int a=13;
        int k=2;
       System.out.println( change(a,k));
     }
}