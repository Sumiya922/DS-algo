import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
		//List<String> vegetables=new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grapes");
//		vegetables.add("potato");
//		vegetables.add("cabbage");
//		fruits.addAll(vegetables);
		//System.out.println(vegetables);
		fruits.set(2, "watermelon");
//		List<String> toRemove=new ArrayList();
//		toRemove.add("apple");
//		toRemove.add("watermelon");
//		fruits.removeAll(toRemove);
		//fruits.remove(2);
		for(String e:fruits)
		{
			System.out.println(e);
		}
//		String temp[]=new String[fruits.size()];
//		//alter(or)
//		fruits.toArray(temp);
//		for(String e:temp)
//		{
//			System.out.println(e);
//		}
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.contains("guava"));
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.get(2));
//		Pair<String,Integer> p1=new Pair("anuj",457);
//		Pair<Double,Boolean> p2=new Pair(45.6,true);
//		p1.getDescription();
//		p2.getDescription();
	}

}
