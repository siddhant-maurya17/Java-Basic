package SinglyLL;
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteAtTailLL
{
    public static Node insertAtTail(Node head,int data){
        Node newNode=new Node(data);
        
        if(head==null){
            return newNode;
        }
        
        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        
        curr.next=newNode;
        return head;
    }
    
    public static void printlist(Node head){
        if(head==null){
            return;
        }
        
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
    public static Node DeleteAtTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        
        Node prev=null;
        Node curr=head;
        
        
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        
        prev.next=curr.next;
        return head;
    }
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  int n=sc.nextInt();
	  Node head=null;
	  
	  for(int i=0;i<n;i++){
	      int data=sc.nextInt();
	      
	      head= insertAtTail(head,data);
	      
	  }
	  head=DeleteAtTail(head);
	  printlist(head);
      sc.close();
	    
	}
}
