import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class TailLL {
    static Node InsertAtTail(Node head,int data){
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
    static void printNode(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=InsertAtTail(head,data);
        }
        printNode(head);
    } 
    }
}
