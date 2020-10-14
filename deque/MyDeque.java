package deque;

public class MyDeque<E> { //using doubly linked list
	Node<E> head,tail;
	public void addToHead(E data)
	{
		Node<E> toAdd=new Node<E>(data);
		if(head==null) //list is empty
		{
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
	}
	public E removeLast() 
	{
		if(head==null)
		{
			return null;
		}
		Node<E> toRemove=tail;
//		if( tail==head)
//		{
//		tail=head=null;
//		return toRemove.data;
//		}
		tail=tail.next;
		tail.prev=null;
		if(tail==null) // if list has 1 element and it is removed
		{
			head=null;
		}
		
		return toRemove.data;
	}
	public static class Node<E>
	{
		E data;
		Node<E> next,prev;
		public Node(E data) {
			this.data=data;
			this.next=this.prev=null;
		}
		
	}

}
