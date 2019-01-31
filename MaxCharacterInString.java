package compatative_programming;
import java.util.*;
public class MaxCharacterInString{
	public static void countChar(String s)
	{
		char arr[]=s.toCharArray();

		char maxChar=' ';
		int count=0;
		int localCount=0;
		for(int i=0;i<arr.length;i++)
		{
		    localCount=1;
			for(int j=i+1;j<arr.length;j++)
			{
			    if(arr[j]==arr[i])
				{
					localCount++;
				}
			}
	        if(localCount>count)
			{
				count=localCount;
				maxChar=arr[i];
			}
		}
		System.out.println(maxChar+" "+count+" ");
	}
	 public static void main(String [] args)
	 {
		 String s1="chetanupretiisaboyandchetanreadsinclassb.tech";
		 countChar(s1);
	 }
}





//time complxity => O(n2)
//space complxity => O(1)