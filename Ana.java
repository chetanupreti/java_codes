import java.util.*;
public class Ana{
    public static boolean check(String s1,String s2)
    {
      //  System.out.println(s1+" "+s2);
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++)
        arr[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++)
          arr[s2.charAt(i)-'a']--;
          int temp=0;
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]>0 || arr[i]<0)
              {
                  temp++;
              }
          }
          
          if(temp==0)
          return true;
          else
          return false;
    }
public static void sub(String s)

         {
             HashMap <Integer,String>arr=new HashMap<Integer,String>(10);
            int k=1;
            for (int i = 0; i < s.length(); i++)  {
              for (int j = i+1; j <= s.length(); j++) {
             
              
               arr.put(k,s.substring(i, j)); 
               k++;
    } }
    int temp=0;
    for(int i=1;i<=arr.size();i++)
    {
       String s1=arr.get(i);
       for(int j=i+1;j<=arr.size();j++)
       {
           String s2=arr.get(j);
           if(s1.length()==s2.length())
           {
               boolean p=check(s1,s2);
               if(p)
               temp++;
           }
       }
    }
    System.out.println(temp);
   
         }
     public static void main(String []args){
         
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    while(t-->0){
        String s1= sc.next();
        
        sub(s1);
    }
     }
}