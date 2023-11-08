package Colllection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Eg_1 {
	public static void main(String[] args) {
		// List
		List <String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		Collections.sort(list);
		list.forEach(System.out::println);//foreach loop
}
}