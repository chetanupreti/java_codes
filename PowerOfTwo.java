public class PowerOfTwo{
     static boolean change(int n)
     {
         if( n>0 && (((n&n-1)==0)))
{
    return true;
}   
else
return false;
         
     }
     public static void main(String []args){
        int a=1;
      
       System.out.println( change(a));
     }
}