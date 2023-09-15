//Gfg Question
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class GfG
{
    boolean isCircular(Node head)
    {
       Node slow=head;
       Node fast=head;
	   do{
	       if(fast==null || fast.next==null){
	           return false;
	       }
	       slow=slow.next;
	       fast=fast.next.next;
	   }
	   while(slow!=fast);
	   return true;
    }
}