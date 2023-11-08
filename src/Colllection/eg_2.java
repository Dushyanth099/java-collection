package Colllection;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class eg_2{

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
	}

}