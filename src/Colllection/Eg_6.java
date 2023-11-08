package Colllection;
import java.util.*;
public class Eg_6 {
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
		//
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	}
	}