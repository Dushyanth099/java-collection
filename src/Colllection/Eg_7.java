package Colllection;
import java.util.*;

public class Eg_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> list = new LinkedList <String>();
		//add element
		list.add("kumar");
		list.add("vicky");
		list.add("vinoth");	
		//ad 1st
		list.addFirst("vasanth");
		//add last
		list.addLast("vishnu");
		
		//add with position
		
		list.add(2,"k7");
		
		
		//Iterator
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		///
		

		//remove first and last
		
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println("------------------");
		//other methods same as array list
		System.out.println(list.indexOf("vinoth"));
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list.contains("HELLO"));
		list.forEach(System.out::println);

	}

}
