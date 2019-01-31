public class BitSet{

     public static void main(String []args){
        int n=7;
        int k=3;
        
        if((n & (1<<(k-1)))>=1)
        {
            System.out.println("set");
        }
        else
         System.out.println("not set");
         
     }
}