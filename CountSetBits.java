public class CountSetBits{
     static int change(int n)
     {
         int c=0;
         while(n>0)
         {
             c+=n&1;
             n=n>>1;
         }
         return c;
         
         
     }
     public static void main(String []args){
        int a=15;
      
       System.out.println( change(a));
     }
}