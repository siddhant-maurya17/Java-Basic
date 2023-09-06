import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList
{
    public static Node insertAtTail(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node Curr=head;
        while(Curr.next!=null){
            Curr=Curr.next;
        }
        Curr.next=newNode;
        return head;
    }
    public static int lengthoflist(Node head){
        if(head==null){
            return -1;
        }
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    public static void insertAtKth(Node head,int k){
        
        int length=lengthoflist(head);
        
        if(k>length){
            System.out.println("-1");
            return;
        }
       
        Node curr=head;
        
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        
        System.out.println("The value of Kth Node is -> "+curr.data);
        
    }
    public static Node insertAtHead(Node head,int data){
       Node newNode=new Node(data);
       
       newNode.next=head;
    //   head=newNode;
       return newNode;
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
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Node head=null;
		
		for(int i=0;i<n;i++){
		    int data=sc.nextInt();
		  //  head=insertAtHead(head,data);
		    head=insertAtTail(head,data);
		   
		}
		printlist(head);
		System.out.println();
		System.out.println("Now Find the Value On which Index it lies- Please Enter Value of K : ");
		int k=sc.nextInt();
		insertAtKth(head,k);
        sc.close();
	}
}