package Colllection;
import java.util.*;
public class Eg_5{
	public static void main(String[] args) {
		// List
		List <String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech mah");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");		
		//Collections.sort(list);
		list.forEach(System.out::println);
		list.remove(2);
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("HELLO"));
	for(String str:list)
		System.out.println(str);
	}

}