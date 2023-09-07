import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next=null;
    }
}

public class InsertAtKthLL
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
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node insertAtKth(Node head,int k,int data){
        Node newNode= new Node(data);
        Node prev=null;
        Node curr=head;
        if(k==1){
            newNode.next=head;
            return newNode;
        }
        for(int i=0;i<k-1;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=newNode;
        newNode.next=curr;
        return head;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		Node head=null;
		
		for(int i=0;i<n;i++){
		    int data=sc.nextInt();
		    head=insertAtTail(head,data);
		}
		int k=sc.nextInt();
		int data_k=sc.nextInt();
		head=insertAtKth(head,k,data_k);
		printlist(head);
        sc.close();
	}
}

