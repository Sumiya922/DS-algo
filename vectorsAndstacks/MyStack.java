package vectorsAndstacks;

import linkedlists.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList<>();
	void push(E e)
	{
	ll.add(e);	
	}
	E pop() throws Exception
	{
	if(ll.isEmpty())
	{
		throw new Exception("cannot pop element from empty stack");
	}
	return ll.removeLast();
	}
	E peek() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("cannot peek element from empty stack");
		}
		return ll.getLastElement();
	}

}
