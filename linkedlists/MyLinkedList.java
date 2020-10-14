package linkedlists;

public class MyLinkedList<E> {
	Node<E> head;
	public void add(E data2)
	{
		Node<E> toAdd=new Node<E>(data2);
		if(head==null)
		{
			head=toAdd;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	public E removeLast() throws Exception
	{
		Node<E> temp=head;
		if(temp==null)
		{
			throw new Exception("cannot remove element from empty list");
		}
		if(temp.next==null)
		{
			Node<E> toRemove=head;
			head=null;
			return toRemove.data2;
		}
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return (E) toRemove.data2;
		
	}
	public E getLastElement() throws Exception
	{
		Node<E> temp=head;
		if(temp==null)
		{
			throw new Exception("cannot remove element from empty list");
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data2;
		
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
void print()
{
	Node<E> temp=head;
	while(temp!=null) // we need last node value also
	{
		System.out.print(temp.data2+" ");
		temp=temp.next;
	}
}
	public static class Node<E>
	{
		public E data2;
		public Node<E> next;
		public Node(E data2) {
			this.data2=data2;
			next=null;
			
		}
	}
	}

