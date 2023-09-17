// Nth node from end of linked list
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution
{
    int lengthList(Node head){
        if(head==null){
            return 0;
        }
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        int length=lengthList(head);
        if(n>length || n<=0){
            return -1;
        }
    // 	head=reverseList(head);
    	
    	for(int i=1;i<length-n+1;i++){
    	    head=head.next;
    	}
    	return head.data;
    }
}
