package SinglyLL;
import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLL {
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
    public static void printReverse(Node head){
        if(head==null){
            return;
        }
        Node curr=head;
     
            printReverse(curr.next);
            System.out.print(curr.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insertAtTail(head,data);
        }
        printReverse(head);
        sc.close();
    }
}
