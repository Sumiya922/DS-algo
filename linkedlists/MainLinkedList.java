package linkedlists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> myLL=new MyLinkedList<>();
		myLL.add(12);
		myLL.add(88);
		for(int i=0;i<10;i++)
		{
			myLL.add(i);
		}
		myLL.print();
//	List<Integer> ll =new LinkedList<>();
//	List<Integer> al =new ArrayList<>();
//	getTimeDiff(ll);
//	getTimeDiff(al);
////	ll.add(12);
////	ll.add(13);
////	ll.add(87);
////	System.out.println(ll);
//
//	}
//	static void getTimeDiff(List<Integer> list)
//	{
//		long start=System.currentTimeMillis();
//		for(int i=0;i<100000;i++)
//		{
//			list.add(0,i);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(list.getClass().getName() +" " +(end-start));
	}
}
