import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String A, String B) {
        // Complete the function
         A=A.toLowerCase();
        B=B.toLowerCase();
       // System.out.println(B);
        int count=0;
        int arr[]=new int[26];
        for(int i=0;i<A.length();i++)
        {
            arr[A.charAt(i)-'a']++;
        }
     //   System.out.println(Arrays.toString(arr));
        
     
       for(int i=0;i<B.length();i++)
        {
            arr[B.charAt(i)-'a']--;
        }
        
       
   //     System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0 || arr[i]!=0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        return true;
        else
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
