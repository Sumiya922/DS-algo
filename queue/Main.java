package queue;
public class Main {

	public static void main(String[] args) {
		MyQueue<Integer> mq=new MyQueue<>();
		//System.out.println(q.poll());
		mq.enqueue(12);
		mq.enqueue(34);
		mq.enqueue(2);
		mq.enqueue(1);
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	//	System.out.println(mq);
//		q.add(12);
//		q.add(2);
//		q.add(128);
//		q.add(212);
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
	}

}
