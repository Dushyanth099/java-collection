package Colllection;
import java.util.*;
public class Eg_9{

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		//covert arraylist into linkedlist 
		LinkedList<String> llistobj =new LinkedList<String>();
		ArrayList <String> arraylist=new ArrayList<String>();
		arraylist.add("string 1");
		arraylist.add("string 2");
		llistobj.addAll(arraylist);
		System.out.println(llistobj);
		list.add("hcl");
		list.add("bbl");
		list.add("bike");
		list.add("car");
		list.add(2,"carl");
		list.set(1,"movie");
		//collection.sort(list);
		list.forEach(System.out::println);
		list.remove(2);
		list.addFirst("ibm");
		list.addLast("pwc india ");
		System.out.println(list.indexOf("imarticus"));
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list.contains("imar"));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf("Imarticus"));
		list.poll();//remove the first ELEMENT(ibm)
		list.pollFirst();//rempve the 1st element(hcl)
		list.pollLast();//remove the last element(imarticus)
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}	
	}
}