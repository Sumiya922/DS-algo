package deque;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		MyDeque<Integer> md=new MyDeque<>();
		md.addToHead(34);
		md.addToHead(344);
		md.addToHead(394);
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());
		
//		ArrayDeque<Integer> ad=new ArrayDeque<>();
//		ad.addFirst(12);
//		ad.addFirst(87);
//		ad.addFirst(84);
//		System.out.println(ad.pop()); // remove last element as in queue removal is from rear.
//		System.out.println(ad.peek());
	}

}
