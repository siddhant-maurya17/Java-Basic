package DoublyLL;
import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class InsertDoublyLL {
    public static Node insertAtHead(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
         return newNode;
        }
       
        
        head.prev=newNode;
        newNode.next=head;
        // newNode=head;

        return newNode;
    }
    public static void printlist(Node head){
        if(head==null){
            return;
        }
        while(head!=null){
            System.out.print(head.data+" ");
             head=head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insertAtHead(head,data);
        }
        printlist(head);
        sc.close();
    }
}
