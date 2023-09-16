package DoublyLL;

import java.util.Scanner;

class Doubly{
    Node prev;
    Node next;
    int data;

    Doubly(int data){
        this.prev=null;
        this.next=null;
        this.data=data;
    }
}
public class ReverseDLL {
    public static Node insertAtTail(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
           newNode.prev=null;
           return newNode;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
        return head;
    }
    public static Node reverseDoubly(Node head){
        Node curr=head;
        Node temp=null;//1 2 3
        while(curr!=null){
            temp=curr.prev;//null
            curr.prev=curr.next;//  null-->2
            curr.next=temp;
            head=curr;
            curr=curr.prev; 
        }
        // if(temp!=null){
        //     head=temp.prev;
        // }
        return head;
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
        head=insertAtTail(head,data);
       }
       head=reverseDoubly(head);
       printlist(head);
       sc.close();

    }
}
