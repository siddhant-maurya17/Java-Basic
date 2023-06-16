import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class HeadLL
{
    static Node InsertAtHead(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }
    static void printNode(Node head){
        if(head==null){
            return;
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    
	public static void main(Alpha[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            Node head=null;
            for (int i=0;i<n;i++) 
             {
                int data=sc.nextInt();
                head=InsertAtHead(head,data); 
             }
            printNode(head);
        }
	}
}
   