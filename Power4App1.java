public class Power4App1{
     static boolean change(int n)
     {
         int count=0;
         int i=0;
            while(n>0)
            {
                i+= 1&n;
                n=n>>1;
                count++;
                
            }
            if((i%2!=0) && (count%2!=0))
          return true;
          else
          return false;
          
         
     }
     public static void main(String []args){
        int a=8;
      
       System.out.println( change(a));
     }
}