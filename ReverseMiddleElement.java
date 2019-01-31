import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Solution{
    public static Node insert(Node head,int data)
    {
        if(head==null)
        return new Node(data);
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            Node t=new Node(data);
            n.next=t;
            return head;
        }
    }
    public static Node reverse(Node head)
    {
        Node cur=head;
        Node pre=null;
        Node curNext;
        while(cur!=null)
        {
            curNext=cur.next;
            cur.next=pre;
            pre=cur;
            
            cur=curNext;
        }
        head=pre;
        return head;
    }
    public static void middleOdd(Node head)
    {
        Node f=head;
        Node s=head;
        while(f.next!=null)
        {
            f=f.next;
            f=f.next;
            s=s.next;
        }
        System.out.println(s.data);
    }
    public static void middleEven(Node head)
    {
        Node f=head;
        Node s=head;
        while(f.next.next!=null)
        {
            f=f.next;
            f=f.next;
            s=s.next;
        }
        System.out.println(s.data);
    }
    
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
       public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       Node head=null;
       while(t-->0)
       {
           int data=sc.nextInt();
           head=insert(head,data);
       }
       print(head);
       head=reverse(head);
       System.out.println();
       print(head);
       System.out.println(); 
       middleEven(head);
     }
}