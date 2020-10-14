// top k elements from n elements
package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			//System.out.println("hello");
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				pq.add(a[i]);
			}
			else
			{
				if(pq.peek()<a[i])
				{
					pq.poll();
					pq.add(a[i]);
					
				}
			}
		}
		// we are sorting pq in descending order
		ArrayList<Integer> ans=new ArrayList(pq);
		Collections.sort(ans,Collections.reverseOrder());
		for(int x:ans)
		{
			System.out.println(x);
		}
//		pq.add("apple");
//		pq.add("kiwi");
//		pq.add("mango");
//		pq.add("banana");
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		
	}

}
