public class NextHigherPower2{
     static int change(int n)
     {
         int count=0;
            while(n>0)
            {
                n=n>>1;
                count++;
                
            }
           // System.out.println(count);
            return (1<<count);
         
     }
     public static void main(String []args){
        int a=15;
      
       System.out.println( change(a));
     }
}